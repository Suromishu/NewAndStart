package task.M4D27;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo02 {
    public static void main(String[] args) throws ParseException {
        String str = "20250408-164020";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
        Date date = sdf.parse(str);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String format = sdf1.format(date);
        System.out.println(format);
    }
}