package ClassRoomExercise.demo5;

import ClassRoomExercise.demo5.demo02.Students;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class demo03 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Students> SC1 = Students.class;
        Constructor<?>[] constructors1 = SC1.getConstructors();
        for (Constructor<?> constructor : constructors1) {
            System.out.println(constructor);
        }

        Constructor<Students> declaredConstructor1 = SC1.getDeclaredConstructor();
        System.out.println(declaredConstructor1);

        declaredConstructor1.setAccessible(true);
        Students students1 = declaredConstructor1.newInstance();

        System.out.println(students1);
    }
}
