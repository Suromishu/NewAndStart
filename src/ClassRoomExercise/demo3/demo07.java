package ClassRoomExercise.demo3;

import java.io.*;

public class demo07 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\ZlS\\WORK_TEST2\\test1.txt");

        Reader reader = new FileReader(file1);

        int i;
        while ((i = reader.read()) != -1) {
            System.out.print((char) i);
        }

        reader.close();
    }
}
