package task.M5D12.demo01;

public class AThread implements Runnable{
    @Override
    public void run() {
        for (int  i = 1; i < 6; i++) {
            System.out.println(test.getInstance());
        }
    }
}

