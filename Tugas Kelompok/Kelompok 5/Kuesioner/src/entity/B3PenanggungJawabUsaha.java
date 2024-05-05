package entity;

public class B3PenanggungJawabUsaha {
  private String nama;
  private Integer umur;
  private Integer jk;
  private Integer pendidikanTertinggi;

  public B3PenanggungJawabUsaha() {}

  public Integer getJk() {
    return jk;
  }

  public String getNama() {
    return nama;
  }

  public Integer getPendidikanTertinggi() {
    return pendidikanTertinggi;
  }

  public Integer getUmur() {
    return umur;
  }

  public void setJk(Integer jk) {
    this.jk = jk;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setPendidikanTertinggi(Integer pendidikanTertinggi) {
    this.pendidikanTertinggi = pendidikanTertinggi;
  }

  public void setUmur(Integer umur) {
    this.umur = umur;
  }

  public void print() {
    System.out.println("a. Nama Penanggung Jawab: " + nama);
    System.out.println("b. Umur: " + umur);
    System.out.println("c. Jenis kelamin: " + jk);
    System.out.println("d. Pendidikan tertinggi: " + pendidikanTertinggi);
  }
}
