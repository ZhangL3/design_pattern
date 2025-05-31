package src.factory.simple_factory;

import src.factory.Operation;

public class Main {
    public static void main(String[] args) {
    Operation oper = null;
    oper = OperationFactory.createOperation("+");
    oper.setNumberA(1);
    oper.setNumberB(2);
    double result = oper.getResult();
    System.out.println("1 + 2 = " + result);
  }
}
