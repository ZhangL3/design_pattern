package src.factory.factory_method;

import src.factory.Operation;
import src.factory.OperationAdd;
import src.factory.OperationDiv;
import src.factory.OperationMul;
import src.factory.OperationSub;

public class Main {
    public void main(String[] args) {
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.createOperation();
        oper.setNumberA(1);
        oper.setNumberB(2);
        double result = oper.getResult();
        System.out.println("1 + 2 = " + result);
    }
}

interface IFactory {
    Operation createOperation();
}

class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}

class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}

class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}

class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
