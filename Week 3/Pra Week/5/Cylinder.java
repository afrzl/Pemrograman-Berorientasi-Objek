/**
 * Cylinder
 */
public class Cylinder {
  private Circle base;
  private double height;

  Cylinder(Circle base, double height) {
    this.base = base;
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public Circle getBase() {
    return base;
  }

  public double volume() {
    return Math.PI * Math.pow(base.getRadius(), 2) * height;
  }

  public String toString() {
    return (
      "Cylinder[" +
      base.toString() +
      "], height=" +
      height +
      ", volume=" +
      volume() +
      "]"
    );
  }
}
