package task.M4D26;

import OtherCode.PerTools.BasicCreate;

import java.util.Arrays;

import static OtherCode.PerTools.ArrayUtil.swapIndex;

public class demo03 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int[] arr = BasicCreate.getRandArray(20);
        System.out.println(Arrays.toString(arr));
        tempBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        long endTime = System.currentTimeMillis();
        System.out.println("冒泡排序耗时：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        int[] arr2 = BasicCreate.getRandArray(20);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        endTime = System.currentTimeMillis();
        System.out.println("Arrays排序耗时：" + (endTime - startTime) + "ms");
    }

    public static void tempBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapIndex(arr, j, j + 1);
                }
            }
        }
    }
}
