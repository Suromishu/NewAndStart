package ClassRoomExercise.demo3;

import java.io.File;

public class demo01 {
    public static void main(String[] args) {
        File dir = new File("E:\\ZlS");

        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                for  (File file1 : file.listFiles()) {
                    System.out.println("文件夹：" + file.getName() + "文件：" + file1.getName());
                }
            } else {
                System.out.println("文件：" + file.getName());
            }
        }
    }
}
