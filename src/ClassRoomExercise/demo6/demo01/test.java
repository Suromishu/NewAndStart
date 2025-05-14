package ClassRoomExercise.demo6.demo01;

public class test {
    public static void main(String[] args) {
        //传统方法
        ImplTest test1 = new ImplTest();
        test1.runTest(10);

        //匿名内部类
        InterfaceTest test2 = new InterfaceTest() {
            @Override
            public void runTest(int a) {
                System.out.println("实现接口2 " + a);
            }
        };
        test2.runTest(20);

        new InterfaceTest() {
            @Override
            public void runTest(int a) {
                System.out.println("实现接口3 " + a);
            }
        }.runTest(30);

        //lambda表达式
        InterfaceTest test3 = (a) -> System.out.println("实现接口4 " + a);
        test3.runTest(40);

        ((InterfaceTest) (a) -> System.out.println("实现接口5 " + a)).runTest(50);

    }
}