package ClassRoomExercise.demo4.demo09;

public class TestThead implements Runnable{

    @Override
    public void run() {
        System.out.println(test.getInstance());
        System.out.println(test.getInstance());
        System.out.println(test.getInstance());
        System.out.println(test.getInstance());
        System.out.println(test.getInstance());
        System.out.println(test.getInstance());
        System.out.println(test.getInstance());
    }

}