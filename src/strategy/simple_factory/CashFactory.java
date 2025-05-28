package strategy.simple_factory;

class CashFactory {
    public static CashSuper createCashAccept(String type) {
        CashSuper cashSuper = null;
        switch (type) {
            case "normal":
                cashSuper = new CashNormal();
                break;
            case "100 off for every 300 purchase":
                cashSuper = new CashReturn("300", "100");
                break;
            case "20% off":
                cashSuper = new CashRebate("0.8");
                break;
            default:
                break;
        }
        return cashSuper;
    }
}