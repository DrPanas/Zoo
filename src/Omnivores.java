public class Omnivores extends Animal implements Eat {

    private int weight;
    private int height;
    private String name;
    private int age;

    public Omnivores(String name, int age, int weight, int height) {
        super(name, age);
        this.weight = weight;
        this.height = height;
    }


    @Override
    public void eat() {
        System.out.println("Eating plant and meat food");
    }
}
