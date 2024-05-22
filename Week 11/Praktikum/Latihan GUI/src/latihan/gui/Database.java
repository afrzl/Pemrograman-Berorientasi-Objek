/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.gui;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author muham
 */
public class Database implements Serializable {
    public static Database instance;

    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "pbo_pra11";
    private final String DB_USER = "root";
    private final String DB_PASS = "";

    private ArrayList<Mahasiswa> data = new ArrayList<>();
    private Database() {
        
    }
    
    public static synchronized Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
    public void insertMahasiswa(Mahasiswa mahasiswa) throws SQLException {
        Connection conn = getConnection();
        try {
            String sql = "INSERT INTO mahasiswa VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNim());
            pstmt.setString(2, mahasiswa.getNama());
            pstmt.setString(3, mahasiswa.getJenisKelamin());
            pstmt.setInt(4, mahasiswa.getUmur());
            pstmt.setString(5, mahasiswa.getAlamat());
            pstmt.setString(6, mahasiswa.getProvinsi());
            pstmt.setString(7, String.join(",", mahasiswa.getHobi()));

            pstmt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
    
    public List<Mahasiswa> getListMahasiswa() throws  SQLException {
        List<Mahasiswa> mhsList = new ArrayList<>();
        Connection conn = getConnection();
        try {
            String sql = "SELECT * FROM mahasiswa";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setJenisKelamin(rs.getString("jk"));
                mhs.setUmur(rs.getInt("umur"));
                mhs.setAlamat(rs.getString("alamat"));
                mhs.setProvinsi(rs.getString("provinsi"));
                mhs.setHobi(new ArrayList<>(Arrays.asList(rs.getString("hobi").split(","))));

                mhsList.add(mhs);
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        return mhsList;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:"+DB_TYPE+"://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME,DB_USER,DB_PASS);
    }
}
