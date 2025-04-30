package ClassRoomExercise.demo2;

import OtherCode.PerTools.BasicCreate;

import java.util.HashMap;

public class demo04 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, BasicCreate.getRandString());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " : " + map.get(i));
        }
    }
}
