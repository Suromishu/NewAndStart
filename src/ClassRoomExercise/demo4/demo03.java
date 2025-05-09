package ClassRoomExercise.demo4;

public class demo03 implements Runnable{
    int num = 200;
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": "+ i + "::" + num--);
        }
    }

    public static void main(String[] args) {
        demo03 de = new demo03();
        Thread t1 = new Thread(de);
        Thread t2 = new Thread(de);

        t1.setName("线程1");
        t2.setName("            线程2");

        t1.start();
        t2.start();

    }
}
