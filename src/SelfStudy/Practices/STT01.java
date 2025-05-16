package SelfStudy.Practices;

import OtherCode.PerTools.BasicCreate;

import java.util.Arrays;

public class STT01 {
    public static void main(String[] args) {
        int[] arr = BasicCreate.getRandArray(20,10);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //打印数组中出现次数最多的数字，及其出现的次数
        System.out.println(Arrays.toString(maxNum(arr)));
    }

    public static int[] maxNum(int[] arr){
        int[] res = new int[2];
        for (int k : arr) {
            int count = 0;
            for (int i : arr) {
                if (k == i) {
                    count++;
                }
            }
            if (count > res[1]) {
                res[0] = k;
                res[1] = count;
            }
        }
        return res;
    }
}
