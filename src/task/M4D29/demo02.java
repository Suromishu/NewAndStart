package task.M4D29;

import java.util.HashSet;
import java.util.Set;

public class demo02 {
    public static void main(String[] args) {
        String[] s = {"for", "if", "if", "do", "while", "do", "do", "break", "switch", "while"};
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        for (String element : s) {
            if (set1.contains(element)) {
                set2.add(element);
            } else {
                set1.add(element);
            }
        }

        System.out.println("所有元素，去除重复元素组成的集合：" + set1);
        System.out.println("重复元素组成的集合：" + set2);
    }
}
