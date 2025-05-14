package ClassRoomExercise.demo6.demo03;

import java.util.ArrayList;
import java.util.Collection;

public class test {
    public static void main(String[] args) {
        Students s1 = new Students("张三", 18);
        Students s2 = new Students("李四", 17);
        Students s3 = new Students("王五", 22);
        Students s4 = new Students("赵六", 24);
        Students s5 = new Students("孙七", 26);

        Collection<Students> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);


        students.stream().filter( stu -> stu.getAge() > 20).forEach(Students::show);
    }
}
