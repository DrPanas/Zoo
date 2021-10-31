public class Fox extends Predators {
    public Fox(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("fast run");
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("roar");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("during the day");
    }
}
