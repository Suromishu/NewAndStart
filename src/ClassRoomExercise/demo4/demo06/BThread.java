package ClassRoomExercise.demo4.demo06;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BThread implements Runnable{

    private Lock lock = new ReentrantLock();
    int num = 100;

    @Override
    public void run() {
        while (true) {
            lock.lock();

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
            lock.unlock();
        }
    }
}
