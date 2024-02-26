import java.util.Calendar;

/**
 * Programmer
 */
public class Programmer extends Pegawai {
  String bahasaPemrograman;
  String platform;

  public Programmer(
    String nama,
    Calendar tanggalLahir,
    String NIP,
    String kantor,
    String unitKerja,
    String NIDN,
    String kelompokKeahlian,
    String bahasaPemrograman,
    String platform
  ) {
    super(nama, tanggalLahir, NIP, kantor, unitKerja, NIDN, kelompokKeahlian);
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

  @Override
  public String getPekerjaan() {
    return "Coding all along day";
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }
}
