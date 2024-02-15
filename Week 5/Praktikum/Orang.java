import java.time.LocalDate;

/**
 * Orang
 */

public abstract class Orang {
  private String nama;
  private LocalDate tanggalLahir;

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

  public String getNamaPanggilan() {
    return nama.substring(0, Math.min(nama.length(), 3));
  }
}
