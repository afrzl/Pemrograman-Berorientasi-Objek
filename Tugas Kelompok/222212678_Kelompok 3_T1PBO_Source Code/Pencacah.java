// 1. Blessy Munthia Purba [222212537]
// 2. Fauzan Alfaraby Nirwan [222212605]
// 3. Janitra Hayu Pramestya [222212678]

import java.time.DateTimeException;
import java.time.LocalDate;

public class Pencacah extends Petugas{
    private String nama;
    private LocalDate tanggalPencacahan;
    private String tandaTangan;
    
    public Pencacah(){
    }

    public Pencacah(String nama, LocalDate tanggalPencacahan, String tandaTangan){
        this.nama = nama;
        this.tanggalPencacahan = tanggalPencacahan;
        this.tandaTangan = tandaTangan;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        if (nama != null && nama.trim().length() >= 5  && nama.trim().length() <= 25 ) {
            this.nama = nama;
            if (!nama.matches("[A-Za-z ]+")) {
            throw new IllegalArgumentException("Terdapat karakter yang tidak valid pada nama");
            }
        } else {
            throw new IllegalArgumentException("Nama tidak valid");
        }
    }

    public LocalDate getTanggalPencacahan(){
        return tanggalPencacahan;
    }

    public void setTanggalPencacahan(LocalDate tanggalPencacahan){
        if (tanggalPencacahan != null) {
            if (!tanggalPencacahan.equals(LocalDate.now())) {
                System.out.println("Warning: Tanggal pencacahan bukan tanggal sekarang.");
            } 
            else {
            this.tanggalPencacahan = tanggalPencacahan;
            }
        } else {
            throw new DateTimeException("Tanggal pencacahan tidak valid");
        }
    }


    public String getTandaTangan(){
        return tandaTangan;
    }

    public void setTandaTangan(String tandaTangan){
        // Validasi tanda tangan tidak boleh kosong
        if (!tandaTangan.trim().isEmpty()) {
            if (tandaTangan != nama){
                System.out.println("Warning: Tanda tangan harus sama dengan nama");
            } else {
                this.tandaTangan = nama;
            }
        } else {
            // Jika tanda tangan tidak valid, throw exception atau tambahkan pesan error
            throw new IllegalArgumentException("Tanda tangan tidak boleh kosong.");
        }
    }
}