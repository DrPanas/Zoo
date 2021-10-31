public class Rabbit extends Herbivores {

    public Rabbit(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Jump");
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("frr-frr");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("at night");
    }
}
