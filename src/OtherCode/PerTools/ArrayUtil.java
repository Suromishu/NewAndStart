package OtherCode.PerTools;

@SuppressWarnings("unused")
public class ArrayUtil {

    /**
     * 交换整形数组中两个元素的索引
     *
     * @param array 整形数组
     * @param index1 第一个元素的索引
     * @param index2 第二个元素的索引
     */
    public static void swapIndex(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * 交换字节数组中两个元素的索引
     *
     * @param array 字节数组
     * @param index1 第一个元素的索引
     * @param index2 第二个元素的索引
     */
    public static void swapIndex(byte[] array, int index1, int index2) {
        byte temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * 交换短整型数组中两个元素的索引
     *
     * @param array 短整型数组
     * @param index1 第一个元素的索引
     * @param index2 第二个元素的索引
     */
    public static void swapIndex(short[] array, int index1, int index2) {
        short temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * 交换长整型数组中两个元素的索引
     *
     * @param array 长整型数组
     * @param index1 第一个元素的索引
     * @param index2 第二个元素的索引
     */
    public static void swapIndex(long[] array, int index1, int index2) {
        long temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * 交换浮点型数组中两个元素的索引
     *
     * @param array 浮点型数组
     * @param index1 第一个元素的索引
     * @param index2 第二个元素的索引
     */
    public static void swapIndex(float[] array, int index1, int index2) {
        float temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * 交换双精度浮点型数组中两个元素的索引
     *
     * @param array 双精度浮点型数组
     * @param index1 第一个元素的索引
     * @param index2 第二个元素的索引
     */
    public static void swapIndex(double[] array, int index1, int index2) {
        double temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}