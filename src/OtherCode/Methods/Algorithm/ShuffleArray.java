package OtherCode.Methods.Algorithm;

import OtherCode.PerTools.ArrayUtil;
import OtherCode.PerTools.BasicCreate;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = BasicCreate.getRandArray(20);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            ArrayUtil.swapIndex(arr, i, index);
        }

        System.out.println(Arrays.toString(arr));
    }
}