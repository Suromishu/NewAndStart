package ClassRoomExercise.demo2;

import java.io.File;
import java.io.IOException;

public class demo10 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\ZlS\\test1.txt");
/*        File file2 = new File("E:\\ZlS", "test2.txt");
        File dir = new File("E:\\ZlS");
        File file3 = new File(dir, "test3.txt");*/

        if (file1.exists()) {
            System.out.println("文件存在");
        } else {
            file1.createNewFile();
        }

    }
}
