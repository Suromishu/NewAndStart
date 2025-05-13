package task.M5D13;

import OtherCode.PerTools.FlexibleRead;
import java.util.HashMap;
import java.util.Map;

public class demo02 {
    public static void main(String[] args) {
        String str = FlexibleRead.readLine();

        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            System.out.println(c + "(" + count + ")");
        }
    }
}