/**
 * Routable
 */
public interface Routable {
  void findBestRoute(Location start, Location end);
}

/**
 * WalkingRoute
 */
class WalkingRoute implements Routable {

  @Override
  public void findBestRoute(Location start, Location end) {
    System.out.println("Implementation of walking routes");
  }
}

/**
 * CarRoute
 */
class CarRoute implements Routable {

  @Override
  public void findBestRoute(Location start, Location end) {
    System.out.println("Implementation of car routes");
  }
}

/**
 * MotorcycleRoute
 */
class MotorcycleRoute implements Routable {

  @Override
  public void findBestRoute(Location start, Location end) {
    System.out.println("Implementation of motorcycle routes");
  }
}
