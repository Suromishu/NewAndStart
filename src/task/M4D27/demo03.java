package task.M4D27;

import java.util.Calendar;

public class demo03 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.print(calendar.get(Calendar.YEAR) + "年");
        System.out.print((calendar.get(Calendar.MONTH) + 1) + "月");
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "日");
    }
}
