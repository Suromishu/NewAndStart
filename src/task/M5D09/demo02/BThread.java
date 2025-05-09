package task.M5D09.demo02;

public class BThread extends Thread{
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i + " 是7的倍数");
            }
        }
    }
}
