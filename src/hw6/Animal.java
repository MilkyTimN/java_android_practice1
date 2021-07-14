package hw6;

public abstract class Animal {
    protected String name;
    protected int age;
    public static int num = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        num++;
    }

    public void run (int distance) {
    }

    public void swim (int distance) {
    }
}
