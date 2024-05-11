/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author muham
 */
public class Database implements Serializable {
    public static Database instance;
    private ArrayList<Mahasiswa> data = new ArrayList<>();
    private Database() {
        
    }
    
    public static synchronized Database getInstance() {
        try {
            loadFile();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
    public void insertMahasiswa(Mahasiswa mahasiswa) {
        data.add(mahasiswa);
        updateFile();
    }
    
    public List<Mahasiswa> getListMahasiswa() {
        return data;
    }
    
    private static void loadFile() throws IOException, ClassNotFoundException {
        try {
            File f = new File("G:\\My Drive\\00. Tingkat 2\\Pemrograman Berorientasi Objek\\Week 10\\Praktikum\\Latihan GUI\\database.dat");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance = (Database) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File tidak ditemukan");
        } catch (IOException ex) {
            System.err.println("File gagal dibaca");
        } catch (ClassNotFoundException ex) {
            System.err.println("Format File salah");
        }
    }
    
    private void updateFile() {
        try {
            FileOutputStream fos = new FileOutputStream("G:\\My Drive\\00. Tingkat 2\\Pemrograman Berorientasi Objek\\Week 10\\Praktikum\\Latihan GUI\\database.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File tidak ditemukan");
        } catch (IOException ex) {
            System.err.println("Gagal menulis file");
        }
    }
}
