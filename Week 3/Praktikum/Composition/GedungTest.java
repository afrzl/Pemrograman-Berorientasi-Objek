/**
 * GedungTest
 */

import java.util.*;

public class GedungTest {

  public static void main(String[] args) {
    Gedung STIS = new Gedung();
    STIS.addRuang("Lobi");
    STIS.addRuang("Bagian Umum");
    STIS.addRuang("Kepala Kantor");

    List<Ruang> ruangan = STIS.getDaftarRuang();
    for (Ruang ruang : ruangan) {
      System.out.println("Ruang : " + ruang.getNamaRuang());
    }
  }
}
