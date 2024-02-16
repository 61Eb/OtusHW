package hw.Homework30;

public class ArrayReturnNew {
    public static int[] getArrayAfterLastOne(int[] arr) {
        int lastOneIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                lastOneIndex = i;
            }
        }

        if (lastOneIndex == -1) {
            throw new RuntimeException("В массиве не найдено ничего");
        }
        int[] result = new int[arr.length - lastOneIndex - 1];
        for (int i = lastOneIndex + 1, j = 0; i < arr.length; i++, j++) {
            result[j] = arr[i];
        }
        return result;
    }
}
