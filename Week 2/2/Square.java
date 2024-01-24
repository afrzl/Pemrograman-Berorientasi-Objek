/**
 * Square
 */
public class Square extends Rectangle {

  public Square() {
    super();
  }

  public Square(double side) {
    super(side, side);
  }

  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  public double getSide() {
    return getWidth();
  }

  public void setSide(double side) {
    setWidth(side);
    setLength(side);
  }

  public void setWidth(double side) {
    super.setWidth(side);
    super.setLength(side);
  }

  public void setLength(double side) {
    super.setWidth(side);
    super.setLength(side);
  }

  @Override
  public String toString() {
    return ("Square[" + super.toString() + "]");
  }
}
