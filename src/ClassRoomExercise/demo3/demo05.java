package ClassRoomExercise.demo3;

import OtherCode.PerTools.FlexibleRead;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo05 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\ZlS\\WORK_TEST2";
        File file1 = new File(path + "\\test1.txt");
        FileOutputStream fos = new FileOutputStream(file1, true);

        while (true) {
            String str = FlexibleRead.readLine();
            if (str.equalsIgnoreCase("exit")) {
                break;
            }
            fos.write("\r\n".getBytes());
            fos.write(str.getBytes());
        }

        fos.close();
    }
}
