package ClassRoomExercise.demo4.demo06;

public class AThread implements Runnable {

    private final Object lock = new Object();
    int num = 100;
    public void run() {
        while (true) {
            synchronized (lock) {
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "：" + num--);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.exit(0);
                }
            }
        }
    }
}
