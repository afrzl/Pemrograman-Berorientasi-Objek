/**
 * Nomor12
 */

class Father {

  public void car() {
    System.out.println("Father's car");
  }
}

class Son extends Father {

  public void car() {
    System.out.println("Son's car");
  }
}

public class Nomor12 {

  public static void main(String[] args) {
    Son john = new Son();
    john.car();
  }
}
