package src.simple_factory;

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

class Operation {
  private double _numberA = 0;
  private double _numberB = 0;

  // add getter and setter for _numberA and _numberB
  public double getNumberA() {
    return _numberA;
  }
  public void setNumberA(double numberA) {
    this._numberA = numberA;
  }
  public double getNumberB() {
    return _numberB;
  }
  public void setNumberB(double numberB) {
    this._numberB = numberB;
  }
  public double getResult() {
    return 0;
  }
}

class OperationAdd extends Operation {
  @Override
  public double getResult() {
    return getNumberA() + getNumberB();
  }
}

class OperationSub extends Operation {
  @Override
  public double getResult() {
    return getNumberA() - getNumberB();
  }
}

class OperationMul extends Operation {
  @Override
  public double getResult() {
    return getNumberA() * getNumberB();
  }
}

class OperationDiv extends Operation {
  @Override
  public double getResult() {
    if (getNumberB() == 0) {
      throw new RuntimeException("除数不能为0");
    }
    return getNumberA() / getNumberB();
  }
}

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