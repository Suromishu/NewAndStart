package task.M5D13.demo04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Dogs dog = new Dogs("小黄", 2);

        Class<Dogs> dogsClass1 = Dogs.class;
        Class<? extends Dogs> dogsClass2 = dog.getClass();
        Class<?> dogsClass3 = Class.forName("task.M5D13.demo04.Dogs");

        Constructor<Dogs> declaredConstructor2 = dogsClass1.getDeclaredConstructor(String.class, int.class);
        declaredConstructor2.setAccessible(true);
        Dogs dog2 = declaredConstructor2.newInstance("小黑", 3);

        Field color3 = dogsClass1.getDeclaredField("color");

        dogsClass1.getMethod("eat").invoke(dog2);

        Field name = dogsClass1.getDeclaredField("name");
        name.setAccessible(true);
        name.set(dog2, "小灰");
    }
}
