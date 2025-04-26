package OtherCode.PersonalUtil;

import java.util.Scanner;

public class FlexibleRead {

    static Scanner sc = new Scanner(System.in);

    public static int inputInt() {
        return sc.nextInt();
    }

    public static long inputLong() {
        return sc.nextLong();
    }

    public static float inputFloat() {
        return sc.nextFloat();
    }

    public static double inputDouble() {
        return sc.nextDouble();
    }

    public static char inputChar() {
        return sc.next().charAt(0);
    }

    public static String inputString() {
        return sc.next();
    }

    public static String readLine() {
        return sc.nextLine();
    }

    public static String readLine(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }
}
