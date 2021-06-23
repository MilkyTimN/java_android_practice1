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

        System.out.println(calculator(a, b, c, d));

        int firstNum = 10;
        int secondNum = 5;

        System.out.println(isBetweenTenAndTwenty(firstNum, secondNum));

        int num = -1;

        isPositive(num);

        int number = 4;

        isPositiveBoolean(number);

    }
    public static float calculator(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    public static boolean isBetweenTenAndTwenty(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        boolean isTrue = false;
        if (sum >=10 && sum <= 20) {
            isTrue = true;
        }
        return isTrue;
    }
    public static void isPositive(int num){
        if (num < 0) {
            System.out.println("The number " + num + " is negative");
        } else {
            System.out.println("The number " + num + " is positive");
        }
    }

    public static boolean isPositiveBoolean(int number) {
        boolean isNegative = true;
        if (number >= 0) {
            isNegative = false;
        }
        return isNegative
    }
}

