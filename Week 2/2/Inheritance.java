/**
 * Inheritance
 */
public class Inheritance {

  public static void main(String[] args) {
    Circle circle1 = new Circle(10);
    System.out.println(circle1.toString());
    System.out.println("Area: " + circle1.getArea());
    System.out.println("Perimeter: " + circle1.getPerimeter());

    Rectangle rect1 = new Rectangle(10, 5);
    System.out.println(rect1.toString());
    System.out.println("Area: " + rect1.getArea());
    System.out.println("Perimeter: " + rect1.getPerimeter());

    Square square1 = new Square(10, "red", false);
    System.out.println(square1.toString());
    System.out.println("Area: " + square1.getArea());
    System.out.println("Perimeter: " + square1.getPerimeter());
  }
}
