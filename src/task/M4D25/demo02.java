package task.M4D25;

import java.util.Arrays;

public class demo02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arrToString(arr));
        System.out.println("------------------");
        System.out.println(Arrays.toString(arr));
    }
    public static String arrToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i];
            } else {
                str += arr[i] + ", ";
            }
        }
        return str + "]";
    }
}