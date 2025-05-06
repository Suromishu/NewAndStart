package ClassRoomExercise.demo2.demo08;

import java.util.ArrayList;
import java.util.Collection;

public class test {
    public static void main(String[] args) {
        students s = new students("张三", 18);

        test t = new test();
        t.show(s);
        t.show(s.getAge());
        t.show(s.getName());

        students s1 = new students("李四", 19);
        students s2 = new students("王五", 20);

        Collection<students> students = new ArrayList<>();
        students.add(s);
        students.add(s1);
        students.add(s2);

        for (students stu : students) {
            System.out.println(stu);
        }
    }

    public <T> void show(T t) {
        System.out.println(t.getClass());
    }
}