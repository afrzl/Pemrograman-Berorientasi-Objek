/**
 * Programmer
 */
public class Programmer extends Pegawai {
  private String bahasaPemrograman;
  private String platform;

  Programmer(String bahasaPemrograman, String platform) {
    this.bahasaPemrograman = bahasaPemrograman;
    this.platform = platform;
  }

  Programmer(Pegawai pegawai, String bahasaPemrograman, String platform) {
    super(
      pegawai.getNama(),
      pegawai.getTanggalLahir(),
      pegawai.getNIP(),
      pegawai.getNamaKantor(),
      pegawai.getUnitKerja()
    );
    this.bahasaPemrograman = bahasaPemrograman;
    this.platform = platform;
  }

  public String getBahasaPemrograman() {
    return bahasaPemrograman;
  }

  public void setBahasaPemrograman(String bahasaPemrograman) {
    this.bahasaPemrograman = bahasaPemrograman;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  @Override
  public String toString() {
    return (
      "Programmer[" +
      super.toString() +
      ", Bahasa Pemrograman=" +
      bahasaPemrograman +
      ", platform=" +
      platform +
      "]"
    );
  }
}
