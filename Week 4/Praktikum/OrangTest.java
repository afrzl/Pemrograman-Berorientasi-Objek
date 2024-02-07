/**
 * OrangTest
 */
public class OrangTest {

  public static void main(String[] args) {
    //Orang o = new Orang(); //error karena orang hanya abstract class, tidak bisa dibuat object
    Pegawai lutfi = new Pegawai("Lutfi", "1111", "STIS", "IT");
    lutfi.setAlamat("Otista 64 C");

    System.out.println(lutfi.getAlamat());

    lutfi.setNIDN("12345678");
    lutfi.setKelompokKeahlian("Computer Science");
    System.out.println(
      "ada dosen " +
      lutfi.getNama() +
      " dengan NIDN " +
      lutfi.getNIDN() +
      " kelompok " +
      lutfi.getKelompokKeahlian()
    );
  }
}
