package ClassRoomExercise.demo4.demo02;

public class CThread extends Thread{
    public void run(){
        for (int i = 1; i < 100; i++) {
            System.out.println("third:      " + i);
        }
    }
}
