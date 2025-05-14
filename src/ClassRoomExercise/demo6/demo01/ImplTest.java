package ClassRoomExercise.demo6.demo01;

public class ImplTest implements InterfaceTest{
    @Override
    public void runTest(int a) {
        System.out.println("实现接口1 " + a);
    }
}
