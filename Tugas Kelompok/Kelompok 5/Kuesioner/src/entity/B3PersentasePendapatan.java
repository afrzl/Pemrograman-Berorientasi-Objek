package entity;

public class B3PersentasePendapatan {
  private Integer offline;
  private Integer marketplace;
  private Integer nonMarketplace;

  public B3PersentasePendapatan() {}

  public Integer getMarketplace() {
    return marketplace;
  }

  public Integer getNonMarketplace() {
    return nonMarketplace;
  }

  public Integer getOffline() {
    return offline;
  }

  public void setMarketplace(Integer marketplace) {
    this.marketplace = marketplace;
  }

  public void setNonMarketplace(Integer nonMarketplace) {
    this.nonMarketplace = nonMarketplace;
  }

  public void setOffline(Integer offline) {
    this.offline = offline;
  }

  public Integer getTotal() {
    return offline + marketplace + nonMarketplace;
  }

  public void print() {
    System.out.println("a. Penjualan offline: " + offline + "%");
    System.out.println("b. Marketplace: " + marketplace + "%");
    System.out.println("c. Selain marketplace: " + nonMarketplace + "%");
    System.out.println("> Total: 100%");
  }
}
