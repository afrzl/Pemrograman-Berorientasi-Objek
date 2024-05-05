/**
 * Main
 */

abstract class Bentuk {

  abstract double luas();

  abstract double keliling();
}

class Lingkaran extends Bentuk {
  double r;

  Lingkaran(double r) {
    this.r = r;
  }

  double luas() {
    return 3.14 * r * r;
  }

  double keliling() {
    return 3.14 * 2 * r;
  }
}

class Segitiga extends Bentuk {
  double a;
  double t;

  Segitiga(double a, double t) {
    this.a = a;
    this.t = t;
  }

  double luas() {
    return 0.5 * a * t;
  }
}

public class Main {

  public static void main(String[] args) {}

  Bentuk segitiga = new Segitiga(10, 7);
  Bentuk lingkaran = new Lingkaran(10);
}
