package OtherCode.PerTools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

@SuppressWarnings("unused")
public class FileUtil {


    /**
     * 创建一个文件
     *
     * @param absolutePath 文件的绝对路径
     * @param fileName 文件名称
     * @return 是否成功创建文件
     */
    public static boolean createFile(String absolutePath, String fileName) {
        File file = new File(absolutePath, fileName);
        try {
            return file.createNewFile();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 创建一个文件夹
     *
     * @param absolutePath 文件夹的绝对路径
     * @param folderName 文件夹名称
     * @return 是否成功创建文件夹
     */
    public static boolean createFiles(String absolutePath, String folderName) {
        File folder = new File(absolutePath, folderName);
        return folder.mkdirs();
    }

    /**
     * 在文件内写入一行字符
     *
     * @param file 待写入的文件
     * @return 是否成功写入文件
     */
    public static boolean writeFile(File file) {
        try (FileOutputStream fos = new FileOutputStream(file, true)) {
            String message = FlexibleRead.readLine();
            fos.write(message.getBytes());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 将一个文件完全复制给另一个文件
     *
     * @param source 复制的文件
     * @param target 目标文件
     * @return 是否成功复制文件
     */
    public static boolean copyFile(File source, File target) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(target, true)) {
            byte[] buffer = new byte[8192];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
