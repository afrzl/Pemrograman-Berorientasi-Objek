package entity;

public class B3MulaiPenjualanOnline {
  private Integer tahunMulaiPenjualanOnline;

  public B3MulaiPenjualanOnline() {}

  public Integer getTahunMulaiPenjualanOnline() {
    return tahunMulaiPenjualanOnline;
  }

  public void setTahunMulaiPenjualanOnline(Integer tahunMulaiPenjualanOnline) {
    this.tahunMulaiPenjualanOnline = tahunMulaiPenjualanOnline;
  }

  public void print() {
    System.out.println(
      "Tahun mulai menerima pesanan melalui internet (online): " +
      tahunMulaiPenjualanOnline.toString()
    );
  }
}
