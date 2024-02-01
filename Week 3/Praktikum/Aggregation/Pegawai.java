/**
 * Pegawai
 */
import java.time.LocalDate;

public class Pegawai extends Orang {
  private String NIP;
  private String namaKantor;
  private String unitKerja;

  Pegawai() {}

  Pegawai(String NIP, String namaKantor, String unitKerja) {
    this.NIP = NIP;
    this.namaKantor = namaKantor;
    this.unitKerja = unitKerja;
  }

  Pegawai(String nama, String NIP, String namaKantor, String unitKerja) {
    super(nama);
    this.NIP = nama;
    this.namaKantor = namaKantor;
    this.unitKerja = unitKerja;
  }

  Pegawai(
    String nama,
    LocalDate tanggalLahir,
    String NIP,
    String namaKantor,
    String unitKerja
  ) {
    super(nama, tanggalLahir);
    this.NIP = nama;
    this.namaKantor = namaKantor;
    this.unitKerja = unitKerja;
  }

  public String getNIP() {
    return NIP;
  }

  public void setNIP(String nIP) {
    NIP = nIP;
  }

  public String getNamaKantor() {
    return namaKantor;
  }

  public void setNamaKantor(String namaKantor) {
    this.namaKantor = namaKantor;
  }

  public String getUnitKerja() {
    return unitKerja;
  }

  public void setUnitKerja(String unitKerja) {
    this.unitKerja = unitKerja;
  }

  public void getGaji() {
    System.out.println("7 juta");
  }

  @Override
  public String toString() {
    return (
      "Pegawai[" +
      super.toString() +
      ", NIP=" +
      NIP +
      ", NamaKantor=" +
      namaKantor +
      ", unitKerja=" +
      unitKerja +
      "]"
    );
  }
}
