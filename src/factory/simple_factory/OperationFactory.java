package src.factory.simple_factory;

import src.factory.Operation;
import src.factory.OperationAdd;
import src.factory.OperationDiv;
import src.factory.OperationMul;
import src.factory.OperationSub;

class OperationFactory {
  public static Operation createOperation(String operate) {
    Operation operation = null;
    switch (operate) {
      case "+":
        operation = new OperationAdd();
        break;
      case "-":
        operation = new OperationSub();
        break;
      case "*":
        operation = new OperationMul();
        break;
      case "/":
        operation = new OperationDiv();
        break;
      default:
        throw new RuntimeException("不支持该运算");
    }
    return operation;
  }
}
