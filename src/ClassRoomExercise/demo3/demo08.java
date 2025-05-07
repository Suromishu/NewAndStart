package ClassRoomExercise.demo3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class demo08 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\ZlS\\WORK_TEST2\\test1.txt");

        FileWriter fw = new FileWriter(file1, true);

        fw.write("Hello World");
    }
}
