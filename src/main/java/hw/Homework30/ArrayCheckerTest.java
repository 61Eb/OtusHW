package hw.Homework30;

public class ArrayCheckerTest {
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array2 = {1, 1};
        int[] array3 = {1, 3};
        int[] array4 = {1, 2, 2, 1};


        System.out.println(ArrayChecker.checkArray(array1));
        System.out.println(ArrayChecker.checkArray(array2));
        System.out.println(ArrayChecker.checkArray(array3));
        System.out.println(ArrayChecker.checkArray(array4));
    }
}
