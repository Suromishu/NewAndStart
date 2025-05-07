package task.M5D07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo01 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\ZlS\\WORK_TEST2\\Image.jpg");
        FileInputStream in = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream("E:\\ZlS\\WORK_TEST\\im.jpg", true);

        int i;
        while ((i = in.read()) != -1) {
            out.write(i);
        }

        in.close();
        out.close();
    }
}
