package ClassRoomExercise.demo1;

import java.util.HashSet;
import java.util.Set;

public class demo09 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        set.add("ddd");
        set.add("ccc");
        System.out.println(set);

        set.remove("aaa");
        System.out.println(set);
    }
}
