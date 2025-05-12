package ClassRoomExercise.demo4.demo07;

public class test {
    public static void main(String[] args) {
        Box box = new Box();
        CreateThread createThread = new CreateThread(box);
        ConsumptionThread consumptionThread = new ConsumptionThread(box);

        int num = 20;
        createThread.setNum(num);
        consumptionThread.setNum(num);

        Thread thread1 = new Thread(createThread);
        Thread thread2 = new Thread(consumptionThread);

        thread1.start();
        thread2.start();
    }
}