import java.util.GregorianCalendar;

/**
 * MainTest
 */
public class MainTest {

  public static void main(String[] args) {
    Pegawai aku = new Pegawai(
      "aku",
      new GregorianCalendar(2015, 8, 31),
      "123456",
      "Polstat STIS",
      "BAU",
      "555555",
      "Ngoding"
    );

    System.out.println(
      "Object Pegawai:\nNama: " +
      aku.getNama() +
      "\nNama Panggilan: " +
      aku.getNamaPanggilan() +
      "\nNIP:" +
      aku.getNIP() +
      "\nKantor: " +
      aku.getKantor() +
      "\nPekerjaan: " +
      aku.getPekerjaan() +
      "\nTanggal Lahir: " +
      aku.getTanggalLahir()
    );

    Pegawai dia = new Pegawai(
      "aku",
      "123456",
      "Polstat STIS",
      "BAU",
      "555555",
      "Ngoding"
    );

    System.out.println(
      "\nObject Pegawai:\nNama: " +
      dia.getNama() +
      "\nNama Panggilan: " +
      dia.getNamaPanggilan() +
      "\nNIP:" +
      dia.getNIP() +
      "\nKantor: " +
      dia.getKantor() +
      "\nPekerjaan: " +
      dia.getPekerjaan() +
      "\nTanggal Lahir: " +
      dia.getTanggalLahir()
    );
  }
}
