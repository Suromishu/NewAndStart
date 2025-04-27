package ClassRoomExercise;

import java.util.Calendar;

public class demo02 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        /*
        c.set(Calendar.YEAR, 2023);
        c.set(Calendar.MONTH, 0);
        */

        System.out.println(c.get(Calendar.YEAR));

        System.out.println(c.get(Calendar.MONTH) + 1);

        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        System.out.println(c.get(Calendar.HOUR_OF_DAY));

        System.out.println(c.get(Calendar.MINUTE));

        System.out.println(c.get(Calendar.SECOND));

        System.out.println(c.get(Calendar.MILLISECOND));

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
    }
}
