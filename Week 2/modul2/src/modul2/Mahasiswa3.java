/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author muham
 */
public class Mahasiswa3 {
    int nim;
    String nama;
    
    void tambahData(int vnim, String vnama) {
        nim = vnim;
        nama = vnama;
    }
    
    void tampilkanInfo() {
        System.out.println(nim + " " + nama);
    }
}
