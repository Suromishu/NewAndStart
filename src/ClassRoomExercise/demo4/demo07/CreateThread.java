package ClassRoomExercise.demo4.demo07;

public class CreateThread implements Runnable{

    private final Box box;
    private int num;

    public CreateThread(Box box) {
        this.box = box;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= num; i++) {
            box.put(i);
        }
    }
}
