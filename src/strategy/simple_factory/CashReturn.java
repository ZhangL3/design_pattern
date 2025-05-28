package strategy.simple_factory;

public class CashReturn extends CashSuper {
    private double condition = 0d;
    private double returnMoney = 0d;

    public CashReturn(String condition, String returnMoney) {
        this.condition = Double.parseDouble(condition);
        this.returnMoney = Double.parseDouble(returnMoney);
    }

    @Override
    public double acceptCash(double money) {
        if (money >= condition) {
            return money - Math.floor(money / condition) * returnMoney;
        }
        return money;
    }
}