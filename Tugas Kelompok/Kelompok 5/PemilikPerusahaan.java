public class PemilikPerusahaan {
  private String nama;
  private int usia;
  private String pendidikan;

  public PemilikPerusahaan(String nama, int usia, String pendidikan) {
    this.nama = nama;
    this.usia = usia;
    this.pendidikan = pendidikan;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getPendidikan() {
    return pendidikan;
  }

  public void setPendidikan(String pendidikan) {
    this.pendidikan = pendidikan;
  }

  public int getUsia() {
    return usia;
  }

  public void setUsia(int usia) {
    this.usia = usia;
  }
}
