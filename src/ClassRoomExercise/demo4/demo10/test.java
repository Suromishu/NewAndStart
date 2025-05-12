package ClassRoomExercise.demo4.demo10;

import OtherCode.PerTools.BasicCreate;

import java.util.Arrays;

public class test implements GetTime{
    @Override
    public void code() {
        int[] arr = BasicCreate.getRandArrayUp(100000, 1000000);
        System.out.println(Arrays.toString(arr));
        System.out.println("========================================");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        GetTime gt = new test();

        System.out.println(gt.getTime());
    }
}
