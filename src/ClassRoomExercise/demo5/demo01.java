package ClassRoomExercise.demo5;

public class demo01 {
    public static void main(String[] args) {
        Class<demo01> demo01Class = demo01.class;
        System.out.println(demo01Class);

        demo01 d1 = new demo01();
        Class<? extends demo01> aClass = d1.getClass();
        System.out.println(aClass);
    }
}
