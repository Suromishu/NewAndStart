package task.M5D12.demo01;

public class test {

    private static volatile test instance;

    private test() {
    }

    public static synchronized test getInstance() {
        if (instance == null) {
            synchronized (test.class) {
                if (instance == null) {
                    instance = new test();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        AThread at = new AThread();

        Thread t1 = new Thread(at);
        Thread t2 = new Thread(at);
        Thread t3 = new Thread(at);

        t1.start();
        t2.start();
        t3.start();
    }
}
