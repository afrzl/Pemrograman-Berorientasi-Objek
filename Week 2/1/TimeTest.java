/**
 * TimeTest
 */
public class TimeTest {

  public static void main(String[] args) {
    Time curr_time = new Time(00, 00, 00);
    System.out.println("Current Time: " + curr_time.toString());

    Time next_sec = curr_time.nextSecond();
    System.out.println("Next Second: " + next_sec.toString());

    Time prev_sec = curr_time.previousSecond();
    System.out.println("Previous Second: " + prev_sec.toString());
  }
}
