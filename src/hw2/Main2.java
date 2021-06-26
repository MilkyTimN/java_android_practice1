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

//Ex2
        int[] array2 = new int[8];
        for (int i = 0, k = 0; i < array2.length; i++, k = i * 3) {
            array2[i] = k;
        }

//Ex3
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }
    }
}
