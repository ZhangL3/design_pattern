package strategy.simple_factory;

class Main {
    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashAccept("20% off");
        double total = cashSuper.acceptCash(300);
        System.out.println("total price:" + total);
    }
}