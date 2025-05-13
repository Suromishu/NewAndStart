package ClassRoomExercise.demo5;

import ClassRoomExercise.demo5.demo02.Students;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class demo04 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Students students = new Students("李四", 20, 100, "男");

        Class<Students> SC1 = Students.class;
        Method[] methods = SC1.getMethods();

        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("======================================================");
        Method show = SC1.getDeclaredMethod("show");
        show.setAccessible(true);
        show.invoke(students);

    }
}
