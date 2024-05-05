/**
 * Polygon
 */
import java.util.*;

public class Polygon extends Shape {
  private List<Point> vertices;

  Polygon(List<Point> vertices) {
    this.vertices = vertices;
  }

  @Override
  void draw() {}
}
