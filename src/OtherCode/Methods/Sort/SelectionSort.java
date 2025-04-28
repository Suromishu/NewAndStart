package OtherCode.Methods.Sort;

import OtherCode.PerTools.ArrayUtil;
import OtherCode.PerTools.BasicCreate;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = BasicCreate.getRandArray(20);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            ArrayUtil.swapIndex(arr, i, minIndex);
        }

        System.out.println(Arrays.toString(arr));
    }
}
