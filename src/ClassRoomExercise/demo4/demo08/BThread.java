package ClassRoomExercise.demo4.demo08;

public class BThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(Thread.currentThread().getName() + ":3的倍数:" + i);
            }
        }
    }
}
