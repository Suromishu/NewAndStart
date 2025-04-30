package ClassRoomExercise.demo2;

import OtherCode.PerTools.BasicCreate;

import java.util.HashMap;
import java.util.Map;

public class demo05 {
    public static void main(String[] args) {
        int[] array = BasicCreate.getRandArray(5000);

        long start = System.currentTimeMillis();
        System.out.println(getRepeatMax1(array));
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");
    }

    private static int getRepeatMax1(int[] array) {
        int max = 0;
        for (int k : array) {
            int count = 0;
            for (int i : array) {
                if (k == i) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    /**
     * 计算数组中重复出现的最多次数
     * 该方法通过遍历数组并使用HashMap来记录每个元素出现的次数，从而找出重复出现的最多次数
     * 如果数组为空或长度为0，则返回0
     *
     * @param array 输入的整数数组
     * @return 重复出现的最多次数如果数组为空或长度为0，则返回0
     */
    private static int getRepeatMax2(int[] array) {
        // 检查数组是否为空或长度为0，如果是，则返回0
        if (array == null || array.length == 0) {
            return 0;
        }

        // 使用HashMap来记录每个元素出现的次数
        Map<Integer, Integer> countMap = new HashMap<>();
        // 初始化最大重复次数为0
        int max = 0;

        // 遍历数组中的每个元素
        for (int num : array) {
            // 获取当前元素的出现次数，如果不存在，则默认为0，然后加1
            int count = countMap.getOrDefault(num, 0) + 1;
            // 更新当前元素的出现次数
            countMap.put(num, count);
            // 如果当前元素的出现次数超过了之前记录的最大重复次数，则更新最大重复次数
            if (count > max) {
                max = count;
                // 如果最大重复次数等于数组长度，说明所有元素都至少出现了一次，可以提前结束循环
                if (max == array.length) {
                    break;
                }
            }
        }
        // 返回最大重复次数
        return max;
    }
}
