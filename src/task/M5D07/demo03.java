package task.M5D07;

import OtherCode.PerTools.FlexibleRead;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demo03 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\ZlS\\WORK_TEST\\students.txt");
        FileWriter wr = new FileWriter(file, true);

        while (true) {
            String line = FlexibleRead.readLine("请输入学生信息：");
            if (line.equals("exit")) {
                break;
            }
            wr.write(line + "\r\n");
            wr.flush();
        }

        wr.write("2025006 王俊凯  30\r\n");
        wr.close();

        FileReader rd = new FileReader(file);
        int ch;
        while ((ch = rd.read()) != -1) {
            System.out.print((char) ch);
        }
    }
}
