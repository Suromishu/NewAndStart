package ClassRoomExercise.demo3;

import OtherCode.PerTools.BasicCreate;
import OtherCode.PerTools.FileUtil;

import java.io.*;

public class demo09 {
    public static void main(String[] args) throws IOException {
        FileUtil.createFile("E:\\ZlS\\WORK_TEST", "test.txt");
        FileUtil.createFile("E:\\ZlS\\WORK_TEST2", "target.txt");
        File file1 = new File("E:\\ZlS\\WORK_TEST\\test.txt");
        File target = new File("E:\\ZlS\\WORK_TEST2\\target.txt");

        FileOutputStream wt1 = new FileOutputStream(file1, true);
        BufferedOutputStream bw1 = new BufferedOutputStream(wt1);

        for (int i = 0; i < 5; i++) {
            String str = BasicCreate.getRandString(15) + "\r\n";
            bw1.write(str.getBytes());
        }
        bw1.close();
        wt1.close();

        FileInputStream rd = new FileInputStream(file1);
        BufferedInputStream br = new BufferedInputStream(rd);
        FileOutputStream wt2 = new FileOutputStream(target, true);
        BufferedOutputStream bw2 = new BufferedOutputStream(wt2);

        int len;
        while ((len = br.read()) != -1) {
            bw2.write(len);
        }

        bw2.close();
        br.close();
        wt2.close();
        rd.close();
    }
}
