package task.M5D06.demo03;

import java.util.Comparator;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("李四", 17);
        Student s3 = new Student("王五", 19);
        Student s4 = new Student("赵六", 18);

        TreeSet<Student> ts = new TreeSet <>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Student student : ts) {
            student.show();
        }
    }
}
