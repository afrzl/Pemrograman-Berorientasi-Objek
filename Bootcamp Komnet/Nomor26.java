/**
 * Nomor26
 */
public class Nomor26 {

  public static void main(String[] args) {
    int sum;
    sum = 10;
    try {
      int i;
      for (i = 1; i < 3; ++i) {
        sum = (sum / i);
      }
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("0");
    }
    System.out.println(sum);
  }
}
