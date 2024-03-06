/**
 * Pegawai
 */
public class Pegawai {
  private String nama;
  private String tipe;
  private String pembayarangaji;

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  public void setTipe(String tipe) {
    this.tipe = tipe;
  }

  public String getTipe() {
    return tipe;
  }

  public void setPembayarangaji(String pembayarangaji) {
    this.pembayarangaji = pembayarangaji;
  }

  public String getPembayarangaji() {
    return pembayarangaji;
  }

  @Override
  public String toString() {
    return (
      "Nama          : " +
      this.nama +
      "\nTipe Pegawai     : " +
      this.tipe +
      "\nPembayarangaji     : " +
      this.pembayarangaji
    );
  }
}
