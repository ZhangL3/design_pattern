package proxy;

public class Main {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl("娇娇");

        Proxy daili = new Proxy(jiaojiao);

        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}

class SchoolGirl {
    private String name;

    public SchoolGirl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface IGiveGift {
    void giveDolls();
    void giveFlowers();
    void giveChocolate();
}

class Pursuit implements IGiveGift {
    private SchoolGirl mm;
    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }
    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + "，送你洋娃娃！");
    }
    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + "，送你鲜花！");
    }
    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "，送你巧克力！");
    }
}

class Proxy implements IGiveGift {
    private Pursuit gg;

    public Proxy(SchoolGirl mm) {
        /**
         * 代理类持有被代理类的引用
         * 这里的gg是被代理的对象
         * Pursuit is hidden behind the Proxy
         * Pursuit is unknown to the client
         */
        
        this.gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}