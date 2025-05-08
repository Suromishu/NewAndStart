package ClassRoomExercise.demo3;

import OtherCode.PerTools.BasicCreate;
import OtherCode.PerTools.FileUtil;

import java.io.*;

public class demo10 {
    public static void main(String[] args) throws IOException {
        FileUtil.createFile("E:\\ZlS\\WORK_TEST", "test.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\ZlS\\WORK_TEST\\test.txt",  true));

        for  (int i = 0; i < Math.random() * 1000; i++) {
            String str = BasicCreate.getRandString((int)(Math.random() * 500)) + "\r\n";
            bw.write(str);
        }
        bw.close();

        FileUtil.createFile("E:\\ZlS\\WORK_TEST2", "target.txt");
        BufferedReader br = new BufferedReader(new FileReader("E:\\ZlS\\WORK_TEST\\test.txt"));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("E:\\ZlS\\WORK_TEST2\\target.txt", true));

        String str;
        while ((str = br.readLine()) != null) {
            bw2.write(str);
            bw2.newLine();
        }
        bw2.close();
        br.close();

    }
}
