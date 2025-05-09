package ClassRoomExercise.demo4.demo02;

public class test {
    public static void main(String[] args) {
        AThread a = new AThread();
        BThread b = new BThread();
        CThread c = new CThread();

        a.start();
        b.start();
        c.start();
    }
}
