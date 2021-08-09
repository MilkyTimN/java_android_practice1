package hw12;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        float[] arr = new float[SIZE];
        fill(arr);
        f1(arr);
        fill(arr);
        f2(arr);

    }
    public static void fill(float[]array){
        Arrays.fill(array, 1);
    }
    public static void f1(float[] array){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long endTime = System.currentTimeMillis();
    }
    public static void f2(float[] array){
        long startTime = System.currentTimeMillis();
        float[] a = new float[HALF];
        float[] b = new float[HALF];

        Thread thread = new Thread(() -> {
            for (int i = 0; i < a.length; i++) {
                a[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < b.length; i++) {
                b[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.arraycopy(a, 0, array, 0, HALF);
        System.arraycopy(b, 0, array, HALF, HALF);
        long endTime = System.currentTimeMillis();
    }
}
