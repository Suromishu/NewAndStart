package ClassRoomExercise.demo4.demo07;

import java.util.ArrayList;

public class Box {
    private ArrayList<Integer> box = new ArrayList<>();

    public synchronized void put(int num) {
        while (box.size() >= 5)
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        box.add(num);
        System.out.println("生产了第" + num + "个产品");
        notifyAll();
    }

    public synchronized void get() {
        while (box.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int product = box.remove(0);
        System.out.println("消费了第" + product + "个产品");
        notifyAll();
    }
}
