import java.time.LocalDate;

/**
 * MainTest
 */
public class MainTest {

  public static void main(String[] args) {
    Pegawai aku = new Pegawai(
      "aku",
      LocalDate.of(2003, 6, 5),
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
      aku.getPekerjaan()
    );

    Programmer kamu = new Programmer(
      "kamu",
      LocalDate.now(),
      "111111",
      "Politeknik Statistika STIS",
      "Unit TI",
      "123123123",
      "Ngoding",
      "Java",
      "Mobile"
    );

    System.out.println(
      "\nObject Programmer:\nNama: " +
      kamu.getNama() +
      "\nNama Panggilan: " +
      kamu.getNamaPanggilan() +
      "\nNIP:" +
      kamu.getNIP() +
      "\nKantor: " +
      kamu.getKantor() +
      "\nPekerjaan: " +
      kamu.getPekerjaan() +
      "\nBahasa Pemrograman: " +
      kamu.getBahasaPemrograman() +
      "\nPlatform: " +
      kamu.getPlatform()
    );
  }
}
