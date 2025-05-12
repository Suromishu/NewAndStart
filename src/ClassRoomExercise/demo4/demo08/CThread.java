package ClassRoomExercise.demo4.demo08;

public class CThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(Thread.currentThread().getName() + ":5的倍数:" + i);
            }
        }
    }
}
