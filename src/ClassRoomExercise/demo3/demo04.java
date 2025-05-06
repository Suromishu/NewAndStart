package ClassRoomExercise.demo3;

import OtherCode.PerTools.FlexibleOperate;

public class demo04 {
    public static void main(String[] args) {
        String path = "E:\\ZlS\\WORK_TEST";
        creMaterial(path);

    }

    private static void creMaterial(String path) {
        for  (int i = 1; i < 6; i++) {
            FlexibleOperate.createFiles(path, String.valueOf((char)(i + 64)));
            for (int j = 1; j < Math.round(Math.random() * 10) + 1; j++) {
                FlexibleOperate.createFile(path + "\\"+ (char)(i + 64), "test" + j + ".txt");
            }
            for (int j = 1; j < Math.round(Math.random() * 10) + 1; j++) {
                FlexibleOperate.createFile(path + "\\"+ (char)(i + 64), "test0" + j + ".png");
            }
        }
    }
}
