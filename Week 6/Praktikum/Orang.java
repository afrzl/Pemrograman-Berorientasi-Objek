import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Orang
 */

public abstract class Orang {
  private String nama;
  private Calendar tanggalLahir;

  public Orang(String nama) {
    this.nama = nama;
  }

  public Orang(String nama, Calendar tanggalLahir) {
    this.nama = nama;
    this.tanggalLahir = tanggalLahir;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  void validatetanggallahir() throws Exception {
    if (tanggalLahir.get(Calendar.YEAR) < 2000) {
      throw new Exception("Dibawah umur");
    } else {
      System.out.println("Cukup umur");
    }
  }

  public String getTanggalLahir() {
    try {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
      validatetanggallahir();
      return sdf.format(tanggalLahir.getTime()).toString();
    } catch (Exception e) {
      return "Belum tersedia";
    } finally {
      System.out.println("error tertangani");
    }
  }

  public void setTanggalLahir(Calendar tanggalLahir) {
    this.tanggalLahir = tanggalLahir;
  }

  public String getNamaPanggilan() {
    return nama.substring(0, Math.min(nama.length(), 3));
  }
}
