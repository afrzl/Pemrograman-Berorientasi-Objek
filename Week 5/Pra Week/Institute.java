/**
 * Institute
 */
public class Institute {
  private String name;
  private String address;

  Institute(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Institute[name=" + name + ", Address: " + address + "]";
  }
}
