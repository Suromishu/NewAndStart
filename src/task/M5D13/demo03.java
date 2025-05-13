package task.M5D13;

import java.io.File;

public class demo03 {
    public static void main(String[] args) {
        File file = new File("E:\\javaSE");

        listJavaFiles(file);
    }

    private static void listJavaFiles(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        // 递归调用
                        listJavaFiles(file);
                    } else if (file.getName().endsWith(".java")) {
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }
        }
    }
}