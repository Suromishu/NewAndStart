package ClassRoomExercise.demo2.demo02;

import OtherCode.PerTools.BasicCreate;

import java.util.Comparator;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        TreeSet<students> set = new TreeSet<>(new Comparator<students>() {
            @Override
            public int compare(students o1, students o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (int i = 0; i < 40; i++) {
            set.add(new students(BasicCreate.getRandString(), (int)(Math.random() * 20)));
        }

        for (students s : set) {
            System.out.println(s);
        }
    }
}
