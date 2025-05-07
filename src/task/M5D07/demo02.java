package task.M5D07;

import java.io.*;

public class demo02 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\ZlS\\WORK_TEST2\\a.txt");
        File file2 = new File("E:\\ZlS\\WORK_TEST\\a.txt");
        FileReader rd = new FileReader(file1);
        FileWriter wr = new FileWriter(file2);

        int ch;
        while ((ch = rd.read()) != -1) {
            wr.write(ch);
        }

        rd.close();
        wr.close();
    }
}
