package ClassRoomExercise.demo3;

import java.io.*;

public class demo06 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\ZlS\\WORK_TEST2\\Image.jpg");
        FileInputStream in = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream("E:\\ZlS\\WORK_TEST\\im.jpg", true);

        while (in.available() > 0) {
            out.write(in.read());
        }

        in.close();
        out.close();
    }
}
