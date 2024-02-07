/**
 * Orang
 */
import java.time.LocalDate;

abstract class Orang {
  String nama;
  LocalDate tanggalLahir;

  public Orang(String nama) {
    this.nama = nama;
  }

  public Orang(String nama, LocalDate tanggalLahir) {
    this.nama = nama;
    this.tanggalLahir = tanggalLahir;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public LocalDate getTanggalLahir() {
    return tanggalLahir;
  }

  public void setTanggalLahir(LocalDate tanggalLahir) {
    this.tanggalLahir = tanggalLahir;
  }

  public abstract String getAlamat();

  public abstract void setAlamat(String alamat);
}
