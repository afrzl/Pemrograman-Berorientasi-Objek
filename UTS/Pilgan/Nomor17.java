// abstract class Shape {

//   public abstract double calculateArea();
// }

class Rectangle extends Shape {
  private double length;
  private double width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double calculateArea() {
    return length * width;
  }
}

/**
 * Nomor17
 */
public class Nomor17 {

  public static void main(String[] args) {
    Shape shape = new Shape();
  }
}
