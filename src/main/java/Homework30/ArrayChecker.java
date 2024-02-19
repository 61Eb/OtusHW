package Homework30;

public class ArrayChecker {
    public static boolean checkArray(int[] array) {
        boolean One = false;
        boolean Two = false;

        for (int num : array) {
            for (int num1 : array) {
                if (num1 == 1) {
                    One = true;
                } else if (num1 == 2) {
                    Two = true;
                }
            }
        }
        return One && Two;
    }
}
