public class Nomor4 {

  public static void main(String[] args) {
    try {
      System.out.println("Ujicoba exception handling");
      System.out.println("Hello" + " " + 1 / 0);
    } catch (Exception e) {
      System.out.println("World" + "\n");
    } finally {
      System.out.println("Ujicoba selesai");
    }
  }
}
