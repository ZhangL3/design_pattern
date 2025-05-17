package src.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ObjectStructure o = new ObjectStructure();
    o.Attach(new Man());
    o.Attach(new Woman());

    Success success = new Success();
    o.Display(success);

    Failing failing = new Failing();
    o.Display(failing);

    Amativeness amativeness = new Amativeness();
    o.Display(amativeness);
  }
}

abstract class Action {
  public abstract void GetManConclusion(Man concreteElementA);
  public abstract void GetWomanConclusion(Woman concreteElementB);
}

class Success extends Action {
  @Override
  public void GetManConclusion(Man concreteElementA) {
    System.out.println(concreteElementA.getClass().getSimpleName() + this.getClass().getSimpleName() + "时，背后大多有一个伟大的女人");
  }

  @Override
  public void GetWomanConclusion(Woman concreteElementB) {
    System.out.println(concreteElementB.getClass().getSimpleName() + this.getClass().getSimpleName() + "时，背后大多有一个不成功的男人");
  }
}

class Failing extends Action {
  @Override
  public void GetManConclusion(Man concreteElementA) {
    System.out.println(concreteElementA.getClass().getSimpleName() + this.getClass().getSimpleName() + "时，闷头喝酒，谁也不用劝。");
  }

  @Override
  public void GetWomanConclusion(Woman concreteElementB) {
    System.out.println(concreteElementB.getClass().getSimpleName() + this.getClass().getSimpleName() + "时，眼泪汪汪，谁也劝不了。");
  }
}

class Amativeness extends Action {
  @Override
  public void GetManConclusion(Man concreteElementA) {
    System.out.println(concreteElementA.getClass().getSimpleName() + this.getClass().getSimpleName() + "时，凡事不懂也要装懂。");
  }

  @Override
  public void GetWomanConclusion(Woman concreteElementB) {
    System.out.println(concreteElementB.getClass().getSimpleName() + this.getClass().getSimpleName() + "时，遇事懂也要装不懂。");
  }
}

abstract class Person {
  public abstract void Accept(Action visitor);
}

class Man extends Person {
  @Override
  public void Accept(Action visitor) {
    visitor.GetManConclusion(this);
  }
}

class Woman extends Person {
  @Override
  public void Accept(Action visitor) {
    visitor.GetWomanConclusion(this);
  }
}

class ObjectStructure {
  private List<Person> elements = new ArrayList<>();

  public void Attach(Person element) {
    elements.add(element);
  }

  public void Detach(Person element) {
    elements.remove(element);
  }

  public void Display(Action visitor) {
    for (Person element : elements) {
      element.Accept(visitor);
    }
  }
}