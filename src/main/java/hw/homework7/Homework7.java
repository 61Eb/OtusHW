package hw.homework7;

public class Homework7 {
    public int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                if (element > 0) {
                    sum += element;
                }
            }
        }
        return sum;
    }

    public void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void nullifyDiagonal(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i][i] = 0;
        }
    }

    public int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] row : array) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    public int sumOfSecondRow(int[][] array) {
        if (array.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int element : array[1]) {
            sum += element;
        }
        return sum;
    }

}
