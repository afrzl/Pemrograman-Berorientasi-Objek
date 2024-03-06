/**
 * FactoryPatternMain
 */
public class FactoryPatternMain {

  public static void main(String[] args) {
    PegawaiFactory factory = new PegawaiFactory();
    System.out.println(factory.buatPegawai("Lutfi", "tetap").toString());

    System.out.println(factory.buatPegawai("Dani", "kontrak").toString());
  }
}
