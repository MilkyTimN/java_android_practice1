package exercise1;

public class Main {
    public static void main(String[] args) {

        byte by = 8;
        short sh = 52;
        int in = 21;
        long lo = 123123L;
        float fl = 123.23f;
        double dou = 1231.123123;
        char ch = 'a';
        boolean isTrue = false;

        float a = 12.3f;
        float b = 44.1f;
        float c = 9.12f;
        float d = 71.0f;


    }
    public float calculator(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }
}

