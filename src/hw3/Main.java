package hw3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        while (true) {
            int randomNum = random.nextInt(10);
            System.out.println("Угадай число от 0 до 9 за 3 попытки");

            for (int i = 2; i >= 0; i--) {
                String s = "Осталось попыток: ";
                int enterNum = scanner.nextInt();
                if (randomNum == enterNum) {
                    System.out.println("Ты выйграл! загаданное число: " + randomNum);
                    break;
                } else {
                    if (enterNum > randomNum) {
                        System.out.println("Загаданное число меньше");
                        System.out.println(s + i);
                    } else if (enterNum < randomNum) {
                        System.out.println("Загаданное число больше");
                        System.out.println(s + i);
                    }
                }
                if (i == 0) {
                    System.out.println("Вы проиграли. Загаданное число было: " + randomNum);
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int tryAgain = scanner.nextInt();
            if (tryAgain == 0) {
                break;
            }
        }
    }
}
