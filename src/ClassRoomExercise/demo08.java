package ClassRoomExercise;

import java.util.ArrayList;
import java.util.Collection;

public class demo08 {
    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c1.add(i);
        }
        for (Integer i : c1) {
            System.out.println(i);
        }
    }
}
