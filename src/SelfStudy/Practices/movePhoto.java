package SelfStudy.Practices;

import java.io.*;

public class movePhoto {
    public static void main(String[] args) throws IOException {
        File source = new File("E:\\ZlS\\WORK_TEST2\\Image.jpg");
        File target = new File("E:\\ZlS\\WORK_TEST\\Image.jpg");

        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(target, true);

        int i;
        while ((i = fis.read()) != -1){
            fos.write(i);
        }
        fos.flush();
        fis.close();
        fos.close();


        FileOutputStream del = new FileOutputStream(source);
        del.close();

        source.delete();
    }
}
