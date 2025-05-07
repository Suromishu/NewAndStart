package task.M4D25;

import OtherCode.PerTools.FlexibleRead;

public class demo01 {
    public static void main(String[] args) {

        String str = FlexibleRead.readLine("请输入：");

        String year = str.substring(6, 10);
        String month = str.substring(10, 12);
        String day = str.substring(12, 14);

        System.out.println("生日是" + year + "年" + month + "月" + day + "日");
    }
}
