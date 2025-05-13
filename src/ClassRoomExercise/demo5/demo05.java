package ClassRoomExercise.demo5;

import ClassRoomExercise.demo5.demo02.Person;
import ClassRoomExercise.demo5.demo02.Students;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class demo05 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person("张三", 18);
        Students students = new Students("李四", 20, 100, "男");

        Constructor<?>[] constructors = Person.class.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        ClassLoader classLoader = Person.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
//        System.out.println(classLoader.getParent().getParent().getParent());

        System.out.println("===================================================");
        Class<?> SC1 = students.getClass();
        Class<?> PC1 = person.getClass();


//        Method workStu = SC1.getDeclaredMethod("work");
        Method workPer = PC1.getDeclaredMethod("work");

/*
        workStu.setAccessible(true);
        workStu.invoke(students);
*/
        workPer.setAccessible(true);
        workPer.invoke(person);
        System.out.println("===================================================");

        Method study = SC1.getDeclaredMethod("study");
//        study.setAccessible(true);
        study.invoke(students);

    }
}
