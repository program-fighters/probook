package generalTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

@RunWith(JUnit4.class)
public class ArrayBlockSwapTest {

    @Test
    public void ok() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        System.out.println(String.format("Before array::%s", Arrays.toString(arr)));
        System.out.println(String.format("Rotate array till %d number", d));
        rotateArray(arr, d);
        System.out.println(String.format("After Rotation array::%s", Arrays.toString(arr)));
    }

    private void reverseArray(int[] arr, int startIndex, int endIndex) {
        for (int i = startIndex, j = endIndex; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    private void rotateArray(int[] arr, int d) {
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, arr.length - 1);
        reverseArray(arr,0,arr.length-1);
    }


}
