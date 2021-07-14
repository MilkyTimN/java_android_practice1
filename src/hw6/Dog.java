package hw6;

public class Dog extends Animal{
    public static int num = 0;
    public Dog(String name, int age) {
        super(name, age);
        num++;
    }

    @Override
    public void run(int distance) {
        if (distance > 500 || distance < 0) {
            System.out.println("Dog " + name + " can not run more than 500 m.");
        } else {
            System.out.println("Dog " + name + " runs " + distance + " m.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10 || distance < 0) {
            System.out.println("Dog " + name + " can not swim more than 10 m.");
        } else {
            System.out.println("Dog " + name + " swims " + distance + " m.");
        }
    }
}
