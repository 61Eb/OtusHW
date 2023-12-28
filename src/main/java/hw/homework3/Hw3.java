package hw.homework3;

import java.util.Scanner;

public class Hw3 {


    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava;");
    }

    public static void checkSign(int a, int b, int c) {

        int sum = (a + b + c);

        System.out.println(sum);

        if (sum >= 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }

    }


    public static void selectColor() {

        int a = (int) (Math.random() * 30);

        System.out.println(a);

        if (a > 20) {
            System.out.println("зеленый");
        }
        if (a <= 20 && a >= 10) {
            System.out.println("желтый");
        }
        if (a < 10 && a >= 0) {
            System.out.println("красный");
        }


    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 20) - 10;
        int b = (int) (Math.random() * 20) - 10;

        if (a >= b) {
            System.out.println("a>=b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
    }


    public static void addOrSubtractAndPrint(boolean increment, int delta, int initvalue) {

        int result;


        if (increment) {
            result = initvalue + delta;
            System.out.println("Result:" + result);

        } else {
            result = initvalue - delta;
            System.out.println("Result:" + result);
        }

    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("введите число от 1 до 5");
            n = scanner.nextInt();
        } while (n < 1 || n > 5);
        System.out.println("вы ввели число: " + n);
        if (n == 1) {
            greetings();
        }
        if (n == 2) {
            checkSign((int) (Math.random() * 20) - 10, (int) (Math.random() * 20) - 10, (int) (Math.random() * 20) - 10);
        }
        if (n == 3) {
            selectColor();
        }
        if (n == 4) {
            compareNumbers();
        }
        if (n == 5) {
            addOrSubtractAndPrint(Math.random() >= 0.5, (int) (Math.random() * 10), (int) (Math.random() * 10));
        }
    }
}
