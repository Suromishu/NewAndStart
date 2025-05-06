package task.M5D06;

import java.io.File;

public class demo01 {
    public static void main(String[] args) {
        File dir = new File("E:\\ZlS\\WORK_TEST");
        showFile(dir);

        System.out.println("---------------------------------------------");
        deleteFile(dir);

        showFile(dir);
    }

    public static void showFile(File file) {
        if (file.isDirectory()) {
            System.out.println(file.getName());
            for (File file1 : file.listFiles()) {
                showFile(file1);
            }
        } else {
            System.out.println(file.getAbsolutePath());
        }
    }

    public static void deleteFile(File file) {
        if (file.isDirectory()) {
            for (File file1 : file.listFiles()) {
                deleteFile(file1);
            }
        }
        if (file.getName().endsWith(".png")) {
            file.delete();
        }
    }
}
