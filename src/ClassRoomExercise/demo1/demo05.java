package ClassRoomExercise.demo1;

import OtherCode.PerTools.FlexibleOperate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo05 {
    public static void main(String[] args) {
        try {
            int i = exceptTest();
        } catch (ParseException e) {
            System.out.println("date");
        } catch (IllegalArgumentException e) {
            System.out.println("a");
        }
    }

    public static int exceptTest() throws ParseException, IllegalArgumentException{
        int a = FlexibleOperate.readInt();

        Date date = new SimpleDateFormat("yyyy-MM-dd-").parse("2025年04月28日");
        System.out.println(date);

        if (a > 100)
            throw new IllegalArgumentException("a取值过大");
        else
            return a * 3;
    }
}
