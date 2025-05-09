package task.M5D09;

import java.io.*;

public class demo01 {
    public static void main(String[] args) throws IOException {
        File source = new File("E:\\ZlS\\TEST\\info.txt");
        File target = new File("F:\\info.txt");

        FileReader fr = new FileReader(source);
        FileWriter fw = new FileWriter(target);

        char[] chars = new char[1024];
        int len;
        while ((len = fr.read(chars)) != -1) {
            fw.write(chars, 0, len);
        }
        fw.flush();
        fr.close();
        fw.close();
    }
}
