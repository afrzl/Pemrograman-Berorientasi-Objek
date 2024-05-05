package entity;

public class B3MemilikiLaporanKeuangan {
  private Integer memilikiLaporanKeuangan;

  public B3MemilikiLaporanKeuangan() {}

  public Integer getMemilikiLaporanKeuangan() {
    return memilikiLaporanKeuangan;
  }

  public void setMemilikiLaporanKeuangan(Integer memilikiLaporanKeuangan) {
    this.memilikiLaporanKeuangan = memilikiLaporanKeuangan;
  }

  public void print() {
    System.out.println(
      "Memiliki laporan keuangan: " +
      (memilikiLaporanKeuangan == 1 ? "Ya" : "Tidak")
    );
  }
}
