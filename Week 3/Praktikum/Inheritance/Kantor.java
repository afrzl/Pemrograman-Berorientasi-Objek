/**
 * Kantor
 */
import java.time.LocalDate;

public class Kantor {

  public static void main(String[] args) {
    Orang lutfi = new Orang();
    lutfi.setNama("Lutfi");

    Orang rahma = new Orang("Rahma");
    rahma.setTanggalLahir(LocalDate.of(1997, 8, 31));

    System.out.println("Ada orang:");
    System.out.println(
      lutfi.getNama() + " lahir pada " + lutfi.getTanggalLahir()
    );
    System.out.println(
      rahma.getNama() + " lahir pada " + rahma.getTanggalLahir()
    );

    Pegawai tuti = new Pegawai(
      "Tuti",
      LocalDate.of(1997, 8, 2),
      "6836492379",
      "STIS",
      "IT"
    );

    System.out.println(
      tuti.getNama() +
      " lahir pada " +
      tuti.getTanggalLahir() +
      " NIP: " +
      tuti.getNIP() +
      " kantor: " +
      tuti.getNamaKantor() +
      " bagian: " +
      tuti.getUnitKerja()
    );

    Programmer afrizal = new Programmer(
      new Pegawai("Afrizal", LocalDate.of(2003, 6, 5), "12345", "STIS", "IT"),
      "PHP",
      "Web"
    );

    System.out.println(afrizal);
  }
}
