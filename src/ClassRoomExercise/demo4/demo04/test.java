package ClassRoomExercise.demo4.demo04;

public class test {
    public static void main(String[] args) {
        AThread Tha = new AThread();
        BThread Thb = new BThread();
        CThread Thc = new CThread();

        Tha.setName("线程A");
        Thb.setName("--------线程B");
        Thc.setName("----------------线程C");

        Tha.setPriority(Thread.MIN_PRIORITY);
        Thc.setPriority(Thread.MAX_PRIORITY);

        Tha.start();
        Thb.start();
        Thc.start();
    }
}
