package task.M5D07;

import OtherCode.PerTools.FileUtil;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo04 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\ZlS\\WORK_TEST\\a.txt");

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String format = sdf.format(date);

        File file2 = new File("E:\\ZlS\\" + format + " a.txt");

        FileUtil.copyFile(file1, file2);

    }
}
