/**
 * DiscountRate
 */
public class DiscountRate {
  static final double serviceDiscountPremium = 0.2;
  static final double serviceDiscountGold = 0.15;
  static final double serviceDiscountSilver = 0.1;
  static final double productDiscountPremium = 0.1;
  static final double productDiscountGold = 0.1;
  static final double productDiscountSilver = 0.1;

  static double getServiceDiscountRate(String type) {
    switch (type) {
      case "Premium":
        return serviceDiscountPremium;
      case "Gold":
        return serviceDiscountGold;
      case "Silver":
        return serviceDiscountSilver;
      default:
        return 0;
    }
  }

  static double getProductDiscountRate(String type) {
    switch (type) {
      case "Premium":
        return productDiscountPremium;
      case "Gold":
        return productDiscountGold;
      case "Silver":
        return productDiscountSilver;
      default:
        return 0;
    }
  }
}
