/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author muham
 */
public class MahasiswaMain4 {
    public static void main(String[] args) {
        Mahasiswa3 s1 = new Mahasiswa3();
        Mahasiswa3 s2 = new Mahasiswa3();
        
        s1.tambahData(123456, "Lutfi");
        s2.tambahData(123457, "Rahma");
        
        s1.tampilkanInfo();
        s2.tampilkanInfo();
    }
}
