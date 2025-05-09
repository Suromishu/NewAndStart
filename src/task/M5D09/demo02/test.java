package task.M5D09.demo02;

public class test {
    public static void main(String[] args) {

/*
        //1.通过继承
        AThread aThread = new AThread();
        BThread bThread = new BThread();

        aThread.start();
        bThread.start();
*/
        //2.通过实现接口

        Thread aThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if (i % 5 == 0) {
                        System.out.println(i + " 是5的倍数");
                    }
                }
            }
        });

        Thread bThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if (i % 7 == 0) {
                        System.out.println(i + " 是7的倍数");
                    }
                }
            }
        });

        aThread.start();
        bThread.start();
    }
}
