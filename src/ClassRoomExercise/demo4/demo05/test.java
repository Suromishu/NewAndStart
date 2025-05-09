package ClassRoomExercise.demo4.demo05;

public class test {
    public static void main(String[] args) throws InterruptedException {
        AThread tha = new AThread();
        BThread thb = new BThread();
        CThread thc = new CThread();

        tha.setName("线程A");
        thb.setName("----线程B");
        thc.setName("--------线程C");

        tha.start();
        tha.join();

        thb.start();
        thc.start();

    }
}
