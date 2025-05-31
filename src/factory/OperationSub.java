package src.factory;

public class OperationSub extends Operation {
  @Override
  public double getResult() {
    return getNumberA() - getNumberB();
  }
}
