interface Inter {}

class One {}

class Two extends One {}

class Three extends One {}

class Four extends Two implements Inter {}

class Five extends Four {}

class Six extends Three {}

public class Nomor2 {

  public static void main(String[] args) {
    Inter inter = new Six();
    One one = new Five();
    Inter inter2 = new Four();
    Three three = new Four();
  }
}
