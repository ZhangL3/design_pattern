package decorator;

public class Main {
    public static void main(String[] args) {
        Component person = new Person("小明");

        System.out.println("\n一种装扮：");

        // 装扮
        Component sneakers = new Sneakers(person);
        Component bigTrouser = new BigTrouser(sneakers);
        Component tShirts = new TShirts(bigTrouser);

        // 展示装扮
        tShirts.show();

        // 另一种装扮
        System.out.println("\n另一种装扮：");

        Component person2 = new Person("小红");
        Component leatherShoes = new LeatherShoes(person2);
        Component tie = new Tie(leatherShoes);
        Component suit = new Suit(tie);

        suit.show();
    }
}

interface Component {
    void show();
}

class Person implements Component {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}

abstract class Finery implements Component {
    protected Component component;

    public Finery(Component component) {
        this.component = component;
    }

    public void show() {
        if (component != null) {
            component.show();
        }
    }
}

class TShirts extends Finery {
    public TShirts(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("大T恤");
    }
}

class BigTrouser extends Finery {
    public BigTrouser(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("垮裤");
    }
}

class Sneakers extends Finery {
    public Sneakers(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("破球鞋");
    }
}

class Suit extends Finery {
    public Suit(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("西装");
    }
}

class Tie extends Finery {
    public Tie(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("领带");
    }
}

class LeatherShoes extends Finery {
    public LeatherShoes(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("皮鞋");
    }
}