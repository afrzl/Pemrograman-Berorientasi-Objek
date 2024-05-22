/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.gui;

import javax.swing.*;
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

    private ArrayList<Mahasiswa> data = new ArrayList<>();
    private Database() {}
    
    public static synchronized Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
    public void insertMahasiswa(Mahasiswa mahasiswa) throws SQLException {
        Connection conn = DBConn.getConnection();
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(conn != null) {
                conn.close();
            }
        }
    }

    public void updateMahasiswa(Mahasiswa mahasiswa) throws SQLException {
        Connection conn = DBConn.getConnection();
        try {
            String sql = "UPDATE mahasiswa SET nama = ?, jk = ?, umur = ?, alamat = ?, provinsi = ?, hobi = ? WHERE nim = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mahasiswa.getNama());
            pstmt.setString(2, mahasiswa.getJenisKelamin());
            pstmt.setInt(3, mahasiswa.getUmur());
            pstmt.setString(4, mahasiswa.getAlamat());
            pstmt.setString(5, mahasiswa.getProvinsi());
            pstmt.setString(6, String.join(",", mahasiswa.getHobi()));
            pstmt.setString(7, mahasiswa.getNim());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(conn != null) {
                conn.close();
            }
        }
    }

    public Mahasiswa getMahasiswa(String nim) throws SQLException {
        Connection conn = DBConn.getConnection();
        Mahasiswa mhs = null;
        try {
            String sql = "SELECT * FROM mahasiswa WHERE nim=? LIMIT 1";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nim);

            ResultSet res = pstmt.executeQuery();
            while (res.next()) {
                mhs = new Mahasiswa();
                mhs.setNim(res.getString("nim"));
                mhs.setNama(res.getString("nama"));
                mhs.setJenisKelamin(res.getString("jk"));
                mhs.setUmur(res.getInt("umur"));
                mhs.setAlamat(res.getString("alamat"));
                mhs.setProvinsi(res.getString("provinsi"));
                mhs.setHobi(new ArrayList<>(Arrays.asList(res.getString("hobi").split(","))));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return mhs;
    }

    public void deleteMahasiswa(String nim) throws SQLException {
        Connection conn = DBConn.getConnection();
        Mahasiswa mhs = new Mahasiswa();
        try {
            String sql = "DELETE FROM mahasiswa WHERE nim=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nim);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
    
    public List<Mahasiswa> getListMahasiswa() throws SQLException {
        List<Mahasiswa> mhsList = new ArrayList<>();
        Connection conn = DBConn.getConnection();
        try {
            String sql = "SELECT * FROM mahasiswa";
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(res.getString("nim"));
                mhs.setNama(res.getString("nama"));
                mhs.setJenisKelamin(res.getString("jk"));
                mhs.setUmur(res.getInt("umur"));
                mhs.setAlamat(res.getString("alamat"));
                mhs.setProvinsi(res.getString("provinsi"));
                mhs.setHobi(new ArrayList<>(Arrays.asList(res.getString("hobi").split(","))));

                mhsList.add(mhs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return mhsList;
    }
}
