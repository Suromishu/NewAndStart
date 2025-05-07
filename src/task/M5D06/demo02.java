package task.M5D06;

import OtherCode.PerTools.FlexibleRead;

import java.util.HashMap;
import java.util.Map;

public class demo02 {
    public static void main(String[] args) {
        String str = FlexibleRead.readLine();
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "(" + entry.getValue() + ") ");
        }
    }
}
