public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {
        System.out.print("Moving...");
    }

    public void voice() {
        System.out.print("Speaking...");
    }

    public void sleep() {
        System.out.print("Sleep...");
    }
}
