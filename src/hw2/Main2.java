package hw2;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 0, 0, 1, 0, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            }
            else if (array[i] == 0) {
                array[i] = 1;
            }
        }
        for (int a: array) {
            System.out.println(a);
        }
    }
}
