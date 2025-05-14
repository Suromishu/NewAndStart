package task.M5D14;

import java.util.Comparator;

public class demo04 {
    public static void main(String[] args) {
        Runnable r= () -> System.out.println("匿名内部类");

        Comparator<Integer> c= Comparator.comparingInt(o -> o);
    }
}
