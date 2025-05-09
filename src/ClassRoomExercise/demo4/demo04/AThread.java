package ClassRoomExercise.demo4.demo04;

public class AThread extends Thread {
    public void run(){
        for (int i = 1; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
