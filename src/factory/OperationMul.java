package src.factory;

public class OperationMul extends Operation {
  @Override
  public double getResult() {
    return getNumberA() * getNumberB();
  }
}
