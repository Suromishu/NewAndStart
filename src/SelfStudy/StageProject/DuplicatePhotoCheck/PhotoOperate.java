package SelfStudy.StageProject.DuplicatePhotoCheck;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhotoOperate {
    public static void main(String[] args) throws IOException {
        String folderPath = ""; // 图片文件夹路径
        String reFolderPath = ""; // 新建的重复图片文件夹路径

        moveDupPhotos(folderPath, reFolderPath);
    }

    public static void moveDupPhotos(String folderPath, String reFolderPath) throws IOException {
        File folder = new File(folderPath);
        File reFolder = new File(reFolderPath);

        boolean flag;
        if (!reFolder.exists()) {
            flag = reFolder.mkdir();
        } else {
            flag = true;
        }
        if (!flag || !folder.exists()) {
            System.out.println("文件夹路径获取失败");
            return;
        }

        List<File> duplicateFiles = new ArrayList<>();
        Map<String, List<File>> hashToFilesMap = new HashMap<>();

        File[] files = folder.listFiles((dir, name) -> {
            String lowerName = name.toLowerCase();
            return lowerName.endsWith(".jpg") || lowerName.endsWith(".png");
        });

        if (files != null) {
            for (File file : files) {
                String hash = calculateImageHash(file);
                if (!hashToFilesMap.containsKey(hash)) {
                    hashToFilesMap.put(hash, new ArrayList<>());
                }
                hashToFilesMap.get(hash).add(file);
            }
        }

        for (List<File> fileList : hashToFilesMap.values()) {
            if (fileList.size() > 1) {
                duplicateFiles.addAll(fileList.subList(1, fileList.size()));
            }
        }

        for (File file : duplicateFiles) {
            Path source = Paths.get(file.getAbsolutePath());
            Path target = Paths.get(reFolderPath, file.getName());
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("重复图片: " + file.getName());
        }
    }

    private static String calculateImageHash(File file) throws IOException {
        return Long.toHexString(file.length());
    }
}