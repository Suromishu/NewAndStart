package ClassRoomExercise.demo4.demo01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test {
    public static void main(String[] args) throws IOException {
        student stu1 = new student("张三", 18, '男');

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\ZlS\\WORK_TEST\\stu.txt"));

        oos.writeObject(stu1);

        oos.close();

    }
}
