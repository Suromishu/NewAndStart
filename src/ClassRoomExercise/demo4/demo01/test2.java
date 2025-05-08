package ClassRoomExercise.demo4.demo01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\ZlS\\WORK_TEST\\stu.txt"));

        student s = (student) ois.readObject();

        ois.close();

        s.show();
    }
}
