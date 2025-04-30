package ClassRoomExercise.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入出生日期 格式 YYYY-MM-dd");
        // 获取出生日期,键盘输入
        String birthdayString = new Scanner(System.in).next();
        // 将字符串日期,转成Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 调用方法parse,字符串转成日期对象
        Date birthdayDate = sdf.parse(birthdayString);
        // 获取今天的日期对象
        Date todayDate = new Date();
        // 出生日期
        long birthdaySecond = birthdayDate.getTime();
        // 今天日期
        long todaySecond = todayDate.getTime();
        // 今天日期  - 出生日期 = 得到时间毫秒值
        long secone = todaySecond-birthdaySecond;
        System.out.println(secone);
        if (secone < 0){
            System.out.println("还没出生呢");
        } else {
            System.out.println(secone/1000/60/60/24);
        }
    }
}