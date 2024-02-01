/**
 * UnitKerja
 */
import java.util.*;

public class UnitKerja {
  private String nama;
  private List<Pegawai> daftarPegawai;

  UnitKerja(String nama, List<Pegawai> daftarPegawai) {
    this.nama = nama;
    this.daftarPegawai = daftarPegawai;
  }

  public String getNama() {
    return nama;
  }

  public List<Pegawai> getDaftarPegawai() {
    return daftarPegawai;
  }

  @Override
  public String toString() {
    String text = "";
    for (Pegawai pegawai : daftarPegawai) {
      text += pegawai.toString();
    }
    return text;
  }
}
