/**
 * AdministrativeEmployee
 */
public class AdministrativeEmployee extends Employee {
  private int attendance;

  AdministrativeEmployee(int ssNo, String name, String email) {
    super(ssNo, name, email);
    attendance = 0;
  }

  public int getAttendance() {
    return attendance;
  }

  public void setAttendance(int attendance) {
    this.attendance = attendance;
  }

  public void attendant() {
    attendance += 1;
  }

  @Override
  public String toString() {
    return (
      "AdministrativeEmployee[" +
      super.toString() +
      ", attendance=" +
      attendance +
      "]"
    );
  }
}
