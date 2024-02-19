package Homework30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test {

    @Test
    public void testGetArrayAfterLastOne() {
        int[] arr1 = {1, 2, 1, 2, 2};
        int[] result1 = {2, 2};
        Assertions.assertArrayEquals(result1, ArrayUtils.getArrayAfterLastOne(arr1));

        int[] arr2 = {2, 2, 2, 2};
        Assertions.assertThrows(RuntimeException.class, () -> ArrayUtils.getArrayAfterLastOne(arr2));
    }

    @Test
    public void testContainsOnlyOnesAndTwos() {
        int[] arr1 = {1, 2};
        Assertions.assertTrue(ArrayUtils.containsOnlyOnesAndTwos(arr1));

        int[] arr2 = {1, 1};
        Assertions.assertFalse(ArrayUtils.containsOnlyOnesAndTwos(arr2));

        int[] arr3 = {1, 3};
        Assertions.assertFalse(ArrayUtils.containsOnlyOnesAndTwos(arr3));

        int[] arr4 = {1, 2, 2, 1};
        Assertions.assertTrue(ArrayUtils.containsOnlyOnesAndTwos(arr4));
    }
}
