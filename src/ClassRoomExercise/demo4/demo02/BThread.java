package ClassRoomExercise.demo4.demo02;

public class BThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("second:    " + i);
        }
    }
}
