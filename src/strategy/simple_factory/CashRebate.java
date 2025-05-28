package strategy.simple_factory;

public class CashRebate extends CashSuper {
    private double rebate = 1d;

    public CashRebate(String rebate) {
        this.rebate = Double.parseDouble(rebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * rebate;
    }
}