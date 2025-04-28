package OtherCode.Methods.Sort;

import OtherCode.PerTools.BasicCreate;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = BasicCreate.getRandArray(20);
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
