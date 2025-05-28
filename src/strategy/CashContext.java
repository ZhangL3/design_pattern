package strategy;

import strategy.simple_factory.*;

public class CashContext {
  CashSuper cs;

  public CashContext(String type) {
    switch (type) {
      case "normal":
        cs = new CashNormal();
        break;
      case "100 off for every 300 purchase":
        cs = new CashReturn("300", "100");
        break;
      case "20% off":
        cs = new CashRebate("0.8");
        break;
      default:
        break;
    }
  }

  public double getResult(double money) {
    return cs.acceptCash(money);
  }
  
}
