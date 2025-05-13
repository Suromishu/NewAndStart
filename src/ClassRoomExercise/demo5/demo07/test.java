package ClassRoomExercise.demo5.demo07;

public class test {
    public static void main(String[] args) {
        Motion mo1 = new Motion(10, 5, Direction2.NORTH);

        mo1.move();
        System.out.println("移动速度是：" + mo1.getSpeed());
    }
}
