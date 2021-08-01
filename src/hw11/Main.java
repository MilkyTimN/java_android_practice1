package hw11;

public class Main {
    public static void main(String[] args) {

        Generics<Integer> array1 = new Generics<>(1, 2, 3, 4, 5);

        array1.replaceElements(1, 2);
        array1.toArrayList();

        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        Orange orange = new Orange();
        Orange orange1 = new Orange();

        Box box = new Box(apple, apple1, apple2);
        Box box1 = new Box(orange, orange1);

        box.getWeight();
        box1.getWeight();

        box.compare(box1);

        box.replace(box1);


    }
}
