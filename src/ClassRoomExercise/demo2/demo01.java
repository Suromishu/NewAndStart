package ClassRoomExercise.demo2;

import java.util.TreeSet;

public class demo01 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.add((int)(Math.random() * 100));
        }
        System.out.println(set);
    }
}
