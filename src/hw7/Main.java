package hw7;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = {new Cat("Barsik", 22, true),
            new Cat("Tom", 27, true),
            new Cat("Jay", 25, true),
            new Cat("Sam", 30, true)};

        Plate plate = new Plate(100);
        plate.addFood(20);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }
}
