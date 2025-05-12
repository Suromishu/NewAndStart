package ClassRoomExercise.demo4.demo08;

public class AThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":2的倍数:" + i);
            }
        }
    }
}