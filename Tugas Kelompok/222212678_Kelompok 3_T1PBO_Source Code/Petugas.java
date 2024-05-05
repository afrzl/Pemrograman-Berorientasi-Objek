// 1. Blessy Munthia Purba [222212537]
// 2. Fauzan Alfaraby Nirwan [222212605]
// 3. Janitra Hayu Pramestya [222212678]

import java.time.LocalDate;
public abstract class Petugas {
    private String nama;
    private LocalDate tanggalPencacahan;
    private String tandaTangan;

    public Petugas(){}

    public Petugas(String nama, LocalDate tanggalPencacahan, String tandaTangan){
        this.nama = nama;
        this.tanggalPencacahan = tanggalPencacahan;
        this.tandaTangan = tandaTangan;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public LocalDate getTanggalPencacahan() {
        return tanggalPencacahan;
    }
    public void setTanggalPencacahan(LocalDate tanggalPencacahan){
        this.tanggalPencacahan = tanggalPencacahan;
    }
    public String getTandaTangan() {
        return tandaTangan;
    }
}


