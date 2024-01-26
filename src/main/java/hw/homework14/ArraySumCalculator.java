package hw.homework14;

public class ArraySumCalculator {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = calculateArraySum(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (AppArraySizeException e) {
            System.out.println("Неверный размер массива: " + e.getMessage());
        } catch (AppArrayDataException e) {
            System.out.println("Неверные данные в массиве: " + e.getMessage());
        }
    }

    public static int calculateArraySum(String[][] array) throws AppArraySizeException, AppArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new AppArraySizeException("Неверный размер массива");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Неверные данные в индексе [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }
}