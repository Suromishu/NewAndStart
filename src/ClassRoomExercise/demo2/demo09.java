package ClassRoomExercise.demo2;

import java.util.ArrayList;
import java.util.Collections;

public class demo09 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.reverse(list);
        for (int i : list) {
            System.out.println(i);
        }
        System.out.println("--------------------------------");
        Collections.shuffle(list);
        for (int i : list) {
            System.out.println(i);
        }
        System.out.println("--------------------------------");
        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
