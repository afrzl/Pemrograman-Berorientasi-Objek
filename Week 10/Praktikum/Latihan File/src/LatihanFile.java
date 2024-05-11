import java.io.*;

public class LatihanFile {
    public static void main(String[] args) {
        try {
            File f = new File("G:\\My Drive\\00. Tingkat 2\\Pemrograman Berorientasi Objek\\Week 10\\Praktikum\\Latihan File\\objek.dat");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Mahasiswa mhs = (Mahasiswa) ois.readObject();
            System.out.println(mhs.getNim());
            System.out.println(mhs.getNama());
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File tidak ditemukan");
        } catch (IOException ex) {
            System.err.println("File gagal dibaca");
        } catch (ClassNotFoundException ex) {
            System.err.println("Format file salah");
        }
    }
}
