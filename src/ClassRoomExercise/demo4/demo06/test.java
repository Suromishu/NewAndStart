package ClassRoomExercise.demo4.demo06;

public class test {
    public static void main(String[] args) throws InterruptedException {
        AThread a = new AThread();
        Thread tha = new Thread(a);
        Thread thb = new Thread(a);
        Thread thc = new Thread(a);


        tha.setName("线程A");
        thb.setName("----线程B");
        thc.setName("--------线程C");

        tha.start();
        thb.start();
        thc.start();

/*
        BThread a = new BThread();
        Thread tha = new Thread(a);
        Thread thb = new Thread(a);
        Thread thc = new Thread(a);


        tha.setName("线程A");
        thb.setName("----线程B");
        thc.setName("--------线程C");

        tha.start();
        thb.start();
        thc.start();
*/
    }
}
