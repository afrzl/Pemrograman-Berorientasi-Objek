package entity;

public class B3PendapatanSebulan {
  private Integer pendapatan;

  public B3PendapatanSebulan() {}

  public Integer getPendapatan() {
    return pendapatan;
  }

  public void setPendapatan(Integer pendapatan) {
    this.pendapatan = pendapatan;
  }

  public void print() {
    System.out.println(
      "Rata-rata pendapatan sebulan tahun 2020: " + pendapatan
    );
  }
}
