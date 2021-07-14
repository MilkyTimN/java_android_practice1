package hw6;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Cat("Barsik", 3);
        Animal a2 = new Dog("Rex", 5);
        Animal a3 = new Dog("Bob", 2);

        a1.run(100);
        a1.swim(1);
        a2.run(600);
        a2.swim(9);


        System.out.println("Animals created: " + Animal.num);
        System.out.println("Dogs created: " + Dog.num);
        System.out.println("Cats created: " + Cat.num);
    }
}
