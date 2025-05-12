package ClassRoomExercise.demo4.demo08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(new AThread());
        es.execute(new BThread());
        es.execute(new CThread());
        es.execute(new AThread());
        es.execute(new BThread());
        es.execute(new CThread());

        es.shutdown();

    }
}
