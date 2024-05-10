/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.gui;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muham
 */
public class Database {
    public static Database instance;
    private ArrayList<Mahasiswa> data = new ArrayList<>();
    private Database() {
        
    }
    
    public static synchronized Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
    public void insertMahasiswa(Mahasiswa mahasiswa) {
        data.add(mahasiswa);
    }
    
    public List<Mahasiswa> getListMahasiswa() {
        return data;
    }
}
