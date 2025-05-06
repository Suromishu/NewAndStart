package ClassRoomExercise.demo3;

import java.io.File;
import java.io.IOException;

public class demo02 {
    public static void main(String[] args) throws IOException {
        File dir = new File("E:\\ZlS\\XXX");

//        File file1 = new File("E:\\ZlS\\XXX\\test.txt");

        if  (dir.isDirectory()) {
            for (int i = 1; i < 10; i++)
                new File(dir, "test" + i + ".txt").createNewFile();
        }
    }
}
