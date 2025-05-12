package ClassRoomExercise.demo4.demo09;

public class test {

    private static volatile test test;

    private test() {
    }

    public static test getInstance() {
        if(test == null) {
            synchronized (test.class) {
                if(test == null) {
                    test = new test();
                }
            }
        }
        return test;
    }

    public static void main(String[] args) {
        TestThead t = new TestThead();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }
}
