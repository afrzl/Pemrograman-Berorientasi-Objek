/**
 * Nomor12
 */
class A {

  public void PrintInfo() {
    System.out.println("A");
  }
}

class B extends A {

  public void PrintInfo() {
    System.out.println("B");
  }
}

public class Nomor12 {

  public static void main(String[] args) {
    B bebe = new B();
    bebe.PrintInfo();
  }
}
