public class Bear extends Omnivores {


    public Bear(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("walks clubfoot");
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("loud roar");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("at night");
    }
}
