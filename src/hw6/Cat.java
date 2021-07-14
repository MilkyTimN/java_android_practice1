package hw6;

public class Cat extends Animal{
    public static int num = 0;
    public Cat(String name, int age) {
        super(name, age);
        num++;
    }

    @Override
    public void run(int distance) {
        if (distance > 200){
            System.out.println("Cat " + name + "can not runs more than 200 m.");
        } else {
            System.out.println("Cat " + name + " runs " + distance + " m.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat " + name + " can not swim");
    }
}
