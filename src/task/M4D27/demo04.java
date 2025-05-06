package task.M4D27;

import OtherCode.PerTools.FlexibleOperate;

import java.text.SimpleDateFormat;

public class demo04 {
    public static void main(String[] args) {
        String str = FlexibleOperate.readLine("请输入你的出生日期：(格式：yyyy-MM-dd)");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long birthday;
        try {
            birthday = sdf.parse(str).getTime();
        } catch (Exception e) {
            throw new RuntimeException("输入格式错误");
        }
        long now = System.currentTimeMillis();
        long between = now - birthday;
        long days = between / (1000 * 60 * 60 * 24);
        System.out.println(days + "天");
    }
}