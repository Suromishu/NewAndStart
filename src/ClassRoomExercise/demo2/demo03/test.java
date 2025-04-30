package ClassRoomExercise.demo2.demo03;

import OtherCode.PerTools.BasicCreate;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        TreeSet<teachers> set1 = new TreeSet<>();
        set1.add(new teachers("张三", 18));
        set1.add(new teachers("王五", 22));
        set1.add(new teachers("李四", 20));

        Set<students> set2 = new HashSet<>();
        for (int i = 0; i < 30; i++){
            if (i < 10){
                set2.add(new students(BasicCreate.getRandString(), (int)(Math.random() * 20), set1.first()));
            } else if (i < 20){
                set2.add(new students(BasicCreate.getRandString(), (int)(Math.random() * 20), set1.last()));
            } else {
                set2.add(new students(BasicCreate.getRandString(), (int)(Math.random() * 20), set1.higher(set1.first())));
            }
        }

        for (students s : set2) {
            System.out.println(s);
        }
    }
}
