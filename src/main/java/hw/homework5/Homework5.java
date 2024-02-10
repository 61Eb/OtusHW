package hw.homework5;

public class Homework5 {
    public static void printStringAmountTimes(int times, String str) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
    public static void sumElementsGreaterThanFive(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 5) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
    public static void fillArrayWithNumber(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }
    public static void arrayElementsByNumber(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
    }
    public static void sumsOfArrayHalves(int[] array) {
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        int mid = array.length / 2;

        for (int i = 0; i < mid; i++) {
            sumFirstHalf += array[i];
        }

        for (int i = mid; i < array.length; i++) {
            sumSecondHalf += array[i];
        }

        if (sumFirstHalf > sumSecondHalf) {
            System.out.println("Сумма первой половины больше.");
        } else if (sumFirstHalf < sumSecondHalf) {
            System.out.println("Сумма второй половины больше.");
        } else {
            System.out.println("Суммы обеих половин равны.");
        }
    }
    public static int[] sumOfArrays(int[]... arrays) {
        int totalLength = 0;
        for (int[] array : arrays) {
            totalLength += array.length;
        }

        int[] result = new int[totalLength];
        int index = 0;

        for (int[] array : arrays) {
            for (int num : array) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }
    public static boolean pointOfArray(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }

            for (int j = i + 1; j < array.length; j++) {
                rightSum += array[j];
            }

            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }
    public static boolean elementsDecreasingOrIncreasing(int[] array, boolean ascending) {
        for (int i = 1; i < array.length; i++) {
            if (ascending) {
                if (array[i] < array[i - 1]) {
                    return false;
                }
            } else {
                if (array[i] > array[i - 1]) {
                    return false;
                }
            }
        }

        return true;
    }
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        printStringAmountTimes(5, "Hello world");
        sumElementsGreaterThanFive(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        fillArrayWithNumber(5, new int[10]);
        arrayElementsByNumber(2, new int[]{1, 2, 3, 4, 5});
        sumsOfArrayHalves(new int[]{1, 2, 3, 4, 5, 6});
        sumOfArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9});
        pointOfArray(new int[]{1, 2, 3, 4, 5});
        elementsDecreasingOrIncreasing(new int[]{1, 2, 3, 4, 5}, true);
        reverseArray(new int[]{1, 2, 3, 4, 5});
    }

}
