package ClassRoomExercise.demo4.demo05;

public class BThread extends Thread {
    public void run()
    {
        for(int i = 0; i < 100; i++)
        {
            System.out.println(Thread.currentThread().getName() + "：" + i);
            if (i > 50)
                Thread.yield();
        }
    }
}
