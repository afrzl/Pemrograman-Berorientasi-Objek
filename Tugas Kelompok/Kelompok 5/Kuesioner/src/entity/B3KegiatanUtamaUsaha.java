package entity;

public class B3KegiatanUtamaUsaha {
  private String kegiatanUtama;
  private Character kodeKategori;
  private Integer kbli;

  public B3KegiatanUtamaUsaha() {}

  public Integer getKbli() {
    return kbli;
  }

  public String getKegiatanUtama() {
    return kegiatanUtama;
  }

  public Character getKodeKategori() {
    return kodeKategori;
  }

  public void setKbli(Integer kbli) {
    this.kbli = kbli;
  }

  public void setKegiatanUtama(String kegiatanUtama) {
    this.kegiatanUtama = kegiatanUtama;
  }

  public void setKodeKategori(Character kodeKategori) {
    this.kodeKategori = kodeKategori;
  }

  public void print() {
    System.out.println("a. Kegiatan utama usaha : " + kegiatanUtama);
    System.out.println("b. Kode kategori usaha : " + kodeKategori);
    System.out.println("c. KBLI 2 digit : " + kbli);
  }
}
