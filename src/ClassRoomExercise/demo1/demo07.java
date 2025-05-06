package ClassRoomExercise.demo1;

import OtherCode.PerTools.FlexibleOperate;

import java.util.ArrayList;
import java.util.Collection;

public class demo07 {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("aaa");
        c1.add("bbb");
        c1.add("ccc");

        Collection<String> c2 = new ArrayList<>();
        c2.add("d");
        c2.add("e");
        c2.add("aaa");
        c2.add("bbb");

        c1.addAll(c2);
        System.out.println(c1);
        Collection<String> c3 = new ArrayList<>(c1);
        c1.removeAll(c2);
        System.out.println(c1);
        if (c1.contains("d"))
            System.out.println("d!");
        else if (c1.contains("ccc"))
            System.out.println("ccc!");

        String re = FlexibleOperate.readLine();
        c1.remove(re);
        if (c1.isEmpty())
            System.out.println("空");

        System.out.println("----------------------");
        for (String string : c1) {
            System.out.println(string);
        }
        System.out.println("----------------------");
        c3.forEach(System.out::println);
    }
}
