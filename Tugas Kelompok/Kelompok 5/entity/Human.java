import java.util.Calendar

public abstract class Human {
  private String nama;
  private String no_hp;
  private Calendar tanggal;

  public String getNama() {
      return nama;
  }

  public void setNama(String nama) {
      this.nama = nama;
  }

  public String getNo_hp() {
      return no_hp;
  }

  public void setNo_hp(String no_hp) {
      this.no_hp = no_hp;
  }

  public Calendar getTanggal() {
      return tanggal;
  }

  public void setTanggal(Calendar tanggal) {
      this.tanggal = tanggal;
  }
}
