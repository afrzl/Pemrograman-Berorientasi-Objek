/**
 * Gedung
 */
import java.util.*;

public class Gedung {
  private List<Ruang> daftarRuang = new ArrayList<Ruang>();

  Gedung() {
    Ruang ruang = new Ruang("Utama");
    daftarRuang.add(ruang);
  }

  public void addRuang(String namaRuang) {
    Ruang ruang = new Ruang(namaRuang);
    daftarRuang.add(ruang);
  }

  public List<Ruang> getDaftarRuang() {
      return daftarRuang;
  }
}
