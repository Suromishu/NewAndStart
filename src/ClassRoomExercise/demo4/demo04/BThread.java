package ClassRoomExercise.demo4.demo04;

public class BThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for  (int i = 1; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
