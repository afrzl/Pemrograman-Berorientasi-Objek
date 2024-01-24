/**
 * Time
 */
public class Time {
  private int hour;
  private int minute;
  private int second;

  public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return this.hour;
  }

  public int getMinute() {
    return this.minute;
  }

  public int getSecond() {
    return this.second;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  public void setTime(int hour, int minute, int second) {
    setHour(hour);
    setMinute(minute);
    setSecond(second);
  }

  public String toString() {
    return (
      String.format("%02d", hour) +
      ":" +
      String.format("%02d", minute) +
      ":" +
      String.format("%02d", second)
    );
  }

  public Time nextSecond() {
    int nextSecond = this.second + 1;
    int nextMinute = this.minute;
    int nextHour = this.hour;

    if (nextSecond >= 60) {
      nextSecond -= 60;
      nextMinute += 1;
      if (nextMinute >= 60) {
        nextMinute -= 60;
        nextHour += 1;
        if (nextHour >= 24) {
          nextHour = 0;
        }
      }
    }

    return new Time(nextHour, nextMinute, nextSecond);
  }

  public Time previousSecond() {
    int prevSecond = this.second - 1;
    int prevMinute = this.minute;
    int prevHour = this.hour;

    if (prevSecond < 0) {
      prevSecond += 60;
      prevMinute -= 1;
      if (prevMinute < 0) {
        prevMinute += 60;
        prevHour -= 1;
        if (prevHour < 0) {
          prevHour = 23;
        }
      }
    }

    return new Time(prevHour, prevMinute, prevSecond);
  }
}
