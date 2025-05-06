package ClassRoomExercise.demo1;


import OtherCode.PerTools.BasicCreate;
import OtherCode.PerTools.FlexibleOperate;

import java.util.InputMismatchException;

//目前所知异常总结
@SuppressWarnings("all")
public class demo04 {
    public static void main(String[] args) {
        exceptTest();
    }

    public static void exceptTest() {

        int i = 0;
        try {
            i = FlexibleOperate.readInt(); //1

            System.out.println(20 / i); //2

            if (i - 10 < 0)
                throw new RuntimeException("i-10小于0"); //3

        } catch (InputMismatchException e) {
            System.out.println("输入不匹配异常");
            //1
        } catch (ArithmeticException e) {
            System.out.println("算术异常");
            //2
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("运行时异常");
            //3
        }finally {
            System.out.println("--------------------------------");
        }

        int[] arr = null;
        try {
            int size = FlexibleOperate.readInt();
            int max = FlexibleOperate.readInt();
            arr = BasicCreate.getRandArrayUp(size, max); //1

            System.out.println(arr[size]); //2

            arr = null;
            System.out.println(arr); //3

        } catch (IllegalArgumentException e) {
            System.out.println("非法数据异常");
            //1
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常");
            //2
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
            //3
        } finally {
            System.out.println("--------------------------------");
        }

        String str = "abc";
        try {
            int index = FlexibleOperate.readInt();
            System.out.println(str.charAt(index)); //1

            str = FlexibleOperate.readString();
            int num = Integer.parseInt(str); //2

            Object obj = "hello";
            Integer number = (Integer) obj;

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("索引越界");
            //1
        } catch (NumberFormatException e) {
            System.out.println("数字格式化异常");
            //2
        } catch (ClassCastException e) {
            System.out.println("类型转换异常");
            //3
        } finally {
            System.out.println("--------------------------------");
        }
    }
}