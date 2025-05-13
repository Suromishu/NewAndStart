package task.M5D13;

import OtherCode.PerTools.ArrayUtil;
import OtherCode.PerTools.BasicCreate;

import java.util.Arrays;

public class demo01 {
    public static void main(String[] args) {
        int[] arr = BasicCreate.getRandArray(20);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArrayUtil.swapIndex(arr, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
