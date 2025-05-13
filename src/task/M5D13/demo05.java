package task.M5D13;

import OtherCode.PerTools.ArrayUtil;
import OtherCode.PerTools.BasicCreate;

import java.util.Arrays;

public class demo05 {
    public static void main(String[] args) {
        int[] arr = BasicCreate.getRandArray(20);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    ArrayUtil.swapIndex(arr, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
