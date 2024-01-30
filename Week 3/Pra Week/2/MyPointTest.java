/**
 * MyPointTest
 */
public class MyPointTest {

  public static void main(String[] args) {
    MyPoint point1 = new MyPoint(3, 1);
    System.out.println("Point 1: ");
    System.out.println(point1);

    MyPoint point2 = new MyPoint(7, 4);
    System.out.println("Point 2: ");
    System.out.println(point2);

    System.out.println("Distance point 1 to (2, 5): ");
    System.out.println(point1.distance(2, 5));

    System.out.println("Distance point 1 to (0, 0): ");
    System.out.println(point1.distance());

    System.out.println("Distance point 1 to point 2: ");
    System.out.println(point1.distance(point2));
  }
}
