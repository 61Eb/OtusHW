package hw.homework5;

public class Homework5 {
    public void printStringAmountTimes(int times, String str) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
    public void sumElementsGreaterThanFive(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 5) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
    public void fillArrayWithNumber(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }
    public void arrayElementsByNumber(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
    }
    public void sumsOfArrayHalves(int[] array) {
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
    public int[] sumOfArrays(int[]... arrays) {
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
    public boolean pointOfArray(int[] array) {
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
    public boolean elementsDecreasingOrIncreasing(int[] array, boolean ascending) {
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
    public void reverseArray(int[] array) {
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

}
