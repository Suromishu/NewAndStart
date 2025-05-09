package task.M5D09.demo02;

public class AThread extends Thread{
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " 是5的倍数");
            }
        }
    }
}
