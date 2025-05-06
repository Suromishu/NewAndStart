package ClassRoomExercise.demo1;

import OtherCode.PerTools.FlexibleOperate;

import java.util.InputMismatchException;

public class demo03 {
    public static void main(String[] args) {
        exceptTest();
    }

    public static void exceptTest(){

        int b = 0;

        try {
            int a = FlexibleOperate.readInt();

            b = 100 / a;
            System.out.println(b);

//            System.out.println("abc12345".charAt(a));

        } catch (InputMismatchException e) {
            System.out.println("录入不匹配");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        } finally {
            System.out.println("不论是否有异常，都会执行");
        }

        System.out.println("程序继续执行");

        try {
            int c;
            if (b > 1)
                throw new RuntimeException("b大于1");
            else
                c = b + 100;
            System.out.println(c);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
