package ClassRoomExercise;

import OtherCode.PerTools.BasicCreate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class demo10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            list.add(BasicCreate.getRandString(6));
        }

        int[] indexArr = BasicCreate.getRandArrayUp(1200, 2000);
        for (int j : indexArr) {
            list.set(j, "0000");
        }

        int[] indexArr2 = BasicCreate.getRandArray(600, 9);
        for (int i = 0; i < indexArr2.length; i++) {
            list.set(700 + i, String.valueOf(indexArr2[i]));
        }

        shuffleLargeList(list);



        long startTime = System.currentTimeMillis();
        System.out.println(count(list));
        long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime) + "ms");

        System.out.println("----------------");

        long startTime2 = System.currentTimeMillis();
        System.out.println(count2(list));
        long endTime2 = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime2 - startTime2) + "ms");
    }



    public static int count(List<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            boolean flag = true;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    public static int count2(List<String> list) {
        // 异常处理：检查输入是否为 null
        if (list == null) {
            throw new IllegalArgumentException("Input list cannot be null");
        }

        // 边界条件处理：如果列表为空，直接返回 0
        if (list.isEmpty()) {
            return 0;
        }

        // 使用 HashSet 来记录已经遍历过的元素
        Set<String> seenElements = new HashSet<>();
        Set<String> uniqueElements = new HashSet<>();

        for (String element : list) {
            if (!seenElements.contains(element)) {
                seenElements.add(element);
                uniqueElements.add(element);
            }
        }

        // 返回唯一元素的数量
        return uniqueElements.size();
    }

    public static <T> void shuffleLargeList(List<T> list) {
        if (list == null || list.size()  <= 1) {
            return; // 无需打乱
        }

        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = list.size()  - 1; i > 0; i--) {
            int j = random.nextInt(i  + 1); // 0 ≤ j ≤ i
            // 交换元素
            T temp = list.get(i);
            list.set(i,  list.get(j));
            list.set(j,  temp);
        }
    }
}
