package decorator;

public class Main_demo {
    public static void main(String[] args) {
        Person person = new Person("小明");

        System.out.println("\n一种装扮：");


        // 装扮
        Sneakers sneakers = new Sneakers("小明");
        BigTrouser bigTrouser = new BigTrouser("小明");
        TShirts tShirts = new TShirts("小明");

        // 组合装扮
        sneakers.decorate(person);
        bigTrouser.decorate(sneakers);
        tShirts.decorate(bigTrouser);

        // 展示装扮
        tShirts.show();

        // 另一种装扮
        System.out.println("\n另一种装扮：");

        LeatherShoes leatherShoes = new LeatherShoes("小红");
        Tie tie = new Tie("小红");
        Suit suit = new Suit("小红");

        leatherShoes.decorate(person);
        tie.decorate(leatherShoes);
        suit.decorate(tie);

        suit.show();
    }
    
}

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}

class Finery extends Person {

    protected Person component;

    public Finery(String name) {
        super(name);
    }

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}

class TShirts extends Finery {

    public TShirts(String name) {
        super(name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("大T恤");
    }
}

class BigTrouser extends Finery {

    public BigTrouser(String name) {
        super(name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("垮裤");
    }
}

class Sneakers extends Finery {

    public Sneakers(String name) {
        super(name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("破球鞋");
    }
}

class Suit extends Finery {

    public Suit(String name) {
        super(name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("西装");
    }
}

class Tie extends Finery {

    public Tie(String name) {
        super(name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("领带");
    }
}

class LeatherShoes extends Finery {

    public LeatherShoes(String name) {
        super(name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("皮鞋");
    }
}