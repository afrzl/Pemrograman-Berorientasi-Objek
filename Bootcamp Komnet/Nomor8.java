/**
 * Nomor8
 */

class One {

  public static void print(int i) {
    System.out.println("Parent");
  }
}

class Two extends One {

  public static void print(byte b) {
    System.out.println("Child");
  }
}

public class Nomor8 {

  public static void main(String[] args) {
    One one = new Two();
    one.print(10);
  }
}
