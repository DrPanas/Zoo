public class Predators extends Animal implements Eat {

    private int weight;
    private int height;

    public Predators(String name, int age, int weight, int height) {
        super(name, age);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void eat() {
        System.out.println("Eating meat food");
    }
}
