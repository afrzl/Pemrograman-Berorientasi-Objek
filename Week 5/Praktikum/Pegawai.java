import java.time.LocalDate;

/**
 * Pegawai
 */
public class Pegawai extends Orang implements Dosen {
  private String NIP;
  private String kantor;
  private String unitKerja;
  private String NIDN;
  private String kelompokKeahlian;

  public Pegawai(
    String nama,
    LocalDate tanggalLahir,
    String NIP,
    String kantor,
    String unitKerja,
    String NIDN,
    String kelompokKeahlian
  ) {
    super(nama, tanggalLahir);
    this.NIP = NIP;
    this.kantor = kantor;
    this.unitKerja = unitKerja;
    this.NIDN = NIDN;
    this.kelompokKeahlian = kelompokKeahlian;
  }

  public String getNIP() {
    return NIP;
  }

  public String getKantor() {
    return kantor;
  }

  public void setNIP(String NIP) {
    this.NIP = NIP;
  }

  public void setKantor(String kantor) {
    this.kantor = kantor;
  }

  @Override
  public String getNIDN() {
    return NIDN;
  }

  @Override
  public void setNIDN(String NIDN) {
    this.NIDN = NIDN;
  }

  @Override
  public String getKeahlian() {
    return kelompokKeahlian;
  }

  @Override
  public String getPekerjaan() {
    return "mengajar";
  }

  @Override
  public void setKeahlian(String keahlian) {
    kelompokKeahlian = keahlian;
  }
}
