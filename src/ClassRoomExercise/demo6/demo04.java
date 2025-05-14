package ClassRoomExercise.demo6;

import java.util.ArrayList;
import java.util.Collection;

public class demo04 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        Collection<String> newList1 = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张")) {
                newList1.add(name);
            }
        }
        for (String name : newList1) {
            System.out.println(name);
        }

        System.out.println("===============================");

        Collection<String> newList2 = new ArrayList<>();
        for (String name : newList1) {
            if (name.length() == 3) {
                newList2.add(name);
            }
        }
        for (String name : newList2) {
            System.out.println(name);
        }
    }
}
