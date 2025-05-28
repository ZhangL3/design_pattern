package strategy;

public class Main  {
  public static void main(String[] args) {
    double total = 0d;

    
    /**
     * 简单工厂模式的使    /usr/bin/env /usr/lib/jvm/java-17-openjdk-amd64/bin/java -cp bin strategy.simple_factory.Main用
     * CashSuper cashSuper = CashFactory.createCashAccept("20% off");
     * double total = cashSuper.acceptCash(300);
     * 
     * 和简单工厂模式相比，策略模式的使用更灵活。
     * 工厂模式需要引用两个类 CashSuper和CashFactory
     * 但是策略模式只需要引用一个类 CashContext
     * 
     * 其实原理就是加了各中间层，解耦里算法选择的过程
     */
    CashContext cashContext = new CashContext("20% off");
    total = cashContext.getResult(300);
    System.out.println("total price:" + total);
  }
  
}
