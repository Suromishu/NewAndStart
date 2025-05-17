package task.M5D16;

import java.io.File;

public class demo01 {
    public static void main(String[] args) {
        String path = "E:\\test";
        File file = new File(path);

        showFiles(file);

        deleteFiles(file);
    }
    public static void showFiles(File file) {
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        if (f.getName().endsWith(".java")) {
                            System.out.println(f.getName() + "\n" + f.getPath() + "\n" + getDate(f.lastModified()) + "\n");
                        }
                    } else if (f.isDirectory()) {
                        showFiles(f);
                    }
                }
            }
        }
    }

    public static void deleteFiles(File file) {
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        if (f.getName().endsWith(".java")) {
                            f.delete();
                        }
                    } else if (f.isDirectory()) {
                        deleteFiles(f);
                    }
                }
            }
        }
    }

    public static String getDate(long time) {
        String date = "";
        date = new java.text.SimpleDateFormat("yyyy-MM-dd").format(time);
        return date;
    }
}
