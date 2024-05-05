package entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Human {
  private String nama;
  private String no_hp;
  private Calendar tanggal;

  public Human() {}

  public Human(String nama, String no_hp, Calendar tanggal) {
    this.nama = nama;
    this.no_hp = no_hp;
    this.tanggal = tanggal;
  }

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

  public String getTanggal() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
    return sdf.format(tanggal.getTime()).toString();
  }

  public void setTanggal(Calendar tanggal) {
    this.tanggal = tanggal;
  }
}
