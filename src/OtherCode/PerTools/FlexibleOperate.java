package OtherCode.PerTools;

import java.io.File;
import java.util.Scanner;

@SuppressWarnings("unused")
public class FlexibleOperate {

    static Scanner sc = new Scanner(System.in);

    /**
     * 读取一个整数
     *
     * @return 输入的整数值
     */
    public static int readInt() {
        return sc.nextInt();
    }

    /**
     * 读取一个长整数
     *
     * @return 输入的长整数值
     */
    public static long readLong() {
        return sc.nextLong();
    }

    /**
     * 读取一个浮点数
     *
     * @return 输入的浮点数值
     */
    public static float readFloat() {
        return sc.nextFloat();
    }

    /**
     * 读取一个双精度浮点数
     *
     * @return 输入的双精度浮点数值
     */
    public static double readDouble() {
        return sc.nextDouble();
    }

    /**
     * 读取一个字符
     *
     * @return 输入的第一个字符
     */
    public static char readChar() {
        return sc.next().charAt(0);
    }

    /**
     * 读取一个字符串
     *
     * @return 输入的字符串
     */
    public static String readString() {
        return sc.next();
    }

    /**
     * 读取一行字符串
     *
     * @return 输入的一行字符串
     */
    public static String readLine() {
        return sc.nextLine();
    }

    /**
     * 读取一行字符串，并在读取前打印提示信息
     *
     * @param message 提示信息
     * @return 输入的一行字符串
     */
    public static String readLine(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    /**
     * 创建一个文件
     *
     * @param absolutePath 文件的绝对路径
     * @param fileName 文件名称
     * @return 是否成功创建文件
     */
    public static boolean createFile(String absolutePath, String fileName) {
        File file = new File(absolutePath, fileName);
        try {
            return file.createNewFile();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 创建一个文件夹
     *
     * @param absolutePath 文件夹的绝对路径
     * @param folderName 文件夹名称
     * @return 是否成功创建文件夹
     */
    public static boolean createFiles(String absolutePath, String folderName) {
        File folder = new File(absolutePath, folderName);
        return folder.mkdirs();
    }
}