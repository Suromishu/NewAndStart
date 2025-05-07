package SelfStudy.StageProject.DuplicatePhotoCheck;

import java.io.File;
import java.io.FilenameFilter;
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
        String folderPath = "C:\\Users\\27050\\IdeaProjects\\NewAndStart\\src\\SelfStudy\\StageProject\\DuplicatePhotoCheck\\photo"; // 图片文件夹路径
        String reFolderPath = "C:\\Users\\27050\\IdeaProjects\\NewAndStart\\src\\SelfStudy\\StageProject\\DuplicatePhotoCheck\\RePhoto"; // 新建的重复图片文件夹路径

        moveDupPhotos(folderPath, reFolderPath);
    }

    public static void moveDupPhotos(String folderPath, String reFolderPath) throws IOException {
        File folder = new File(folderPath);
        File reFolder = new File(reFolderPath);

        if (!reFolder.exists()) {
            reFolder.mkdir();
        }

        List<File> duplicateFiles = new ArrayList<>();
        Map<String, List<File>> hashToFilesMap = new HashMap<>();

        // 遍历文件夹中的所有图片
        File[] files = folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                String lowerName = name.toLowerCase();
                return lowerName.endsWith(".jpg") || lowerName.endsWith(".png");
            }
        });

        //  计算图片的哈希值
        for (File file : files) {
            String hash = calculateImageHash(file);
            if (!hashToFilesMap.containsKey(hash)) {
                hashToFilesMap.put(hash, new ArrayList<File>());
            }
            hashToFilesMap.get(hash).add(file);
        }

        // 找出重复的图片
        for (List<File> fileList : hashToFilesMap.values()) {
            if (fileList.size() > 1) {
                duplicateFiles.addAll(fileList.subList(1, fileList.size()));
            }
        }

        // 将重复的图片移动到 RePhoto 文件夹
        for (File file : duplicateFiles) {
            Path source = Paths.get(file.getAbsolutePath());
            Path target = Paths.get(reFolderPath, file.getName());
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("重复图片: " + file.getName());
        }
    }

    private static String calculateImageHash(File file) throws IOException {
        String str1 = Long.toHexString(file.length());
        String str2 = Long.toHexString(file.lastModified());
        return String.valueOf((str1 + str2).hashCode());
    }
}