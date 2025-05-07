package ClassRoomExercise.demo3;

import OtherCode.PerTools.FileUtil;

public class demo03 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            FileUtil.createFile("E:\\ZlS\\XXX", "test" + i + ".txt");
        }
    }
}
