package generalTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

@RunWith(JUnit4.class)
public class ArrayCyclicRotateTest {

    @Test
    public void ok() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(String.format("Before array::%s", Arrays.toString(arr)));
        rotateArray(arr,arr.length);
        System.out.println(String.format("After Rotation array::%s", Arrays.toString(arr)));
    }


    private void rotateArray(int[] arr, int length) {

        int lastValue= arr[length-1];
        for (int i = 0;i < length-1; i++) {
            arr[i+1] = arr[i];
        }
       arr[0]=lastValue;

    }


}
