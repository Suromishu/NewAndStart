package ClassRoomExercise.demo5.demo06;

public class test {
    public static void main(String[] args) {
        Motion mo1 = new Motion(10, 5, Direction.NORTH);

        mo1.move();
        System.out.println("移动速度是：" + mo1.getSpeed());
    }
}
