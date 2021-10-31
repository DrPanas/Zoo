public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("f", 4);
        Herbivores h1 = new Herbivores("g", 10, 7, 6);
        Predators p1 = new Predators("d", 7, 4, 6);
        Omnivores o1 = new Omnivores("k", 5, 7, 6);
        Rabbit r1 = new Rabbit("Nik", 2, 3, 20);
        Gazelle g1 = new Gazelle("Monika", 5, 80, 120);
        Gazelle g2 = new Gazelle("Rihanna", 4, 45, 90);
        Wolf w1 = new Wolf("Rex", 6, 15, 50);
        Fox f1 = new Fox("Dusya", 4, 28, 80);
        Bear b1 = new Bear("Nik", 12, 150, 250);
        a1.move();
        a1.voice();
        a1.sleep();

        h1.eat();
        h1.sleep();

        p1.eat();
        p1.voice();

        o1.sleep();
        o1.eat();


        r1.move();
        r1.voice();
        r1.sleep();
        r1.eat();

        extracted(g2);
        extracted(g1);

        w1.move();
        w1.voice();
        w1.sleep();
        w1.eat();

        f1.move();
        f1.voice();
        f1.sleep();
        f1.eat();

        b1.move();
        b1.voice();
        b1.sleep();
        b1.eat();
    }

    private static void extracted(Gazelle g1) {
        g1.move();
        g1.voice();
        g1.sleep();
        g1.eat();
    }


}
