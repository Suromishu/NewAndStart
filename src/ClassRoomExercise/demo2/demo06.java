package ClassRoomExercise.demo2;

import OtherCode.PerTools.BasicCreate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo06 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 1; i <= 20; i++) {
            map.put(BasicCreate.getRandString(), BasicCreate.getRandString());
        }

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("----------------------------");

        Set<Map.Entry<String, String>> entry = map.entrySet();

        for (Map.Entry<String, String> entry1 : entry) {
            System.out.println(entry1.getKey() + " : " + entry1.getValue());
        }
    }
}
