package OtherCode.PerTools;

import java.util.Arrays;
import java.util.Random;

@SuppressWarnings("unused")
public class BasicCreate {

    static final int defaultMax = 100;
    static final int defaultSize = 10;
    static final String defaultChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    static final String defaultUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String defaultLower = "abcdefghijklmnopqrstuvwxyz";
    static final String defaultDigits = "0123456789";

    /**
     * 获取指定大小的随机整形数组
     *
     * @param size 数组大小
     * @param max  随机数的最大值（不包含）
     * @return 包含随机整数的数组
     */
    public static int[] getRandArray(int size, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * max);
        }
        return array;
    }

    /**
     * 获取指定大小的随机整形数组，默认最大值为100
     *
     * @param size 数组大小
     * @return 包含随机整数的数组
     */
    public static int[] getRandArray(int size) {
        return getRandArray(size, defaultMax);
    }

    /**
     * 获取随机整形数组，默认最大值为100，长度为10
     *
     * @return 包含随机整数的数组
     */
    public static int[] getRandArray() {
        return getRandArray(defaultSize);
    }

    /**
     * 获取指定大小的随机整形数组，数组中不会有重复数字
     *
     * @param size 数组大小
     * @param max  随机数的最大值（不包含）
     * @return 包含随机整数的数组
     * @throws IllegalArgumentException 如果 size > max，则抛出异常
     */
    public static int[] getRandArrayUp(int size, int max) {
        if (size > max) {
            throw new IllegalArgumentException("数组大小不能大于随机数的最大值");
        }
        int[] array = new int[max];
        for (int i = 0; i < max; i++) {
            array[i] = i;
        }
        tempShuffleArray(array);
        return Arrays.copyOf(array, size);
    }

    /**
     * 获取指定大小的随机整形数组，数组中不会有重复数字，默认最大值为100
     *
     * @param size 数组大小
     * @return 包含随机整数的数组
     */
    public static int[] getRandArrayUp(int size) {
        return getRandArrayUp(size, defaultMax);
    }

    /**
     * 获取随机整形数组，数组中不会有重复数字，默认最大值为100，长度为10
     *
     * @return 包含随机整数的数组
     */
    public static int[] getRandArrayUp() {
        return getRandArrayUp(defaultSize);
    }

    /**
     * 获取指定长度和类型的随机字符串
     *
     * @param size 字符串长度
     * @param type 字符串类型（如大小写字母、数字等）
     * @return 随机字符串
     */
    public static String getRandString(int size, CharsetType type) {
        String chars = "";
        switch (type) {
            case ALL:
                chars = defaultChars;
                break;
            case UPPER:
                chars = defaultUpper;
                break;
            case LOWER:
                chars = defaultLower;
                break;
            case NO_DIGITS:
                chars = defaultUpper + defaultLower;
                break;
            case UPPER_DIGITS:
                chars = defaultUpper + defaultDigits;
                break;
            case LOWER_DIGITS:
                chars = defaultLower + defaultDigits;
                break;
            case DIGITS:
                chars = defaultDigits;
                break;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int index = (int) (Math.random() * chars.length());
            sb.append(chars.charAt(index));
        }
        return sb.toString();
    }

    /**
     * 获取指定长度的随机字符串，默认类型为 ALL
     *
     * @param size 字符串长度
     * @return 随机字符串
     */
    public static String getRandString(int size) {
        return getRandString(size, CharsetType.ALL);
    }

    /**
     * 获取随机字符串，默认类型为 ALL，长度为10
     *
     * @return 随机字符串
     */
    public static String getRandString() {
        return getRandString(defaultSize);
    }


    /**
     * 洗牌算法：对数组进行随机打乱
     *
     * @param array 待洗牌的数组
     */
    private static void tempShuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            ArrayUtil.swapIndex(array, i, index);
        }
    }
}