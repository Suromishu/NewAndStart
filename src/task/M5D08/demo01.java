package task.M5D08;

import OtherCode.PerTools.FileUtil;
import OtherCode.PerTools.FlexibleRead;

import java.io.*;
import java.util.Properties;

public class demo01 {
    public static void main(String[] args) throws IOException {
        FileUtil.createFile("E:\\ZlS\\WORK_TEST", "students.txt");
        File file = new File("E:\\ZlS\\WORK_TEST\\students.txt");

        OutputStream os = new FileOutputStream(file, true);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        while (true) {
            String str = FlexibleRead.readLine("输入学生信息：");
            if (str.equals("exit")) {
                break;
            }
            bos.write(str.getBytes());
            bos.write("\r\n".getBytes());
            bos.flush();
        }
        bos.write(FlexibleRead.readLine("添加学生: 2025006 王俊凯 30\n").getBytes());
        bos.close();

        Properties prop = new Properties();
        prop.load(new FileReader(file));

        for (String key : prop.stringPropertyNames()) {
            System.out.println(key + " " +prop.getProperty(key));
        }

        System.out.println("------------------------------------");
        System.out.println("2025005 " + prop.getProperty("2025005"));

        prop.remove("2025004");

        prop.setProperty("2025003", "大壮 30");

        for (String key : prop.stringPropertyNames()) {
            System.out.println(key + " " +prop.getProperty(key));
        }
    }
}
