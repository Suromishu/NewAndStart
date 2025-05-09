package ClassRoomExercise.demo4.demo04;

public class CThread extends Thread {
    @Override
    public void run() {
        for  (int i = 1; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
