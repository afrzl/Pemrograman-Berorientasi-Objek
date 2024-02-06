/**
 * MovableTest
 */
public class MovableTest {

  public static void main(String[] args) {
    Movable[] movables = new Movable[2];

    movables[0] = new MovablePoint(5, 6, 2, 3);
    movables[1] = new MovableCircle(1, 2, 3, 4, 8);
    System.out.println("Posisi awal point: " + movables[0].toString());
    System.out.println("Posisi awal circle: " + movables[1].toString());

    movables[0].moveDown();
    movables[0].moveLeft();
    movables[0].moveLeft();
    movables[0].moveUp();

    movables[1].moveDown();
    movables[1].moveLeft();
    movables[1].moveLeft();
    movables[1].moveUp();

    System.out.println("Posisi akhir point: " + movables[0].toString());
    System.out.println("Posisi akhir circle: " + movables[1].toString());
  }
}
