/**
 * MainTest
 */
public class MainTest {

  public static void main(String[] args) {
    Location rumahAku = new Location(
      "Rumah Aku",
      new Coordinates(-6.322d, 107.872)
    );
    Location rumahKamu = new Location(
      "Rumah Kamu",
      new Coordinates(-6.287d, 106.273)
    );

    Route bestRoute = new Walking(rumahAku, rumahKamu);
    bestRoute.printRoute();

    bestRoute = new Riding(rumahAku, rumahKamu);
    bestRoute.printRoute();

    bestRoute = new Driving(rumahAku, rumahKamu);
    bestRoute.printRoute();
  }
}
