package task.M4D29.demo01;

import java.util.HashSet;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();
        set.add(new Employee("张三", 18, 5000));
        set.add(new Employee("张三", 18, 5000));
        set.add(new Employee("李四", 20, 6000));
        set.add(new Employee("王五", 20, 7000));

        set.forEach(System.out::println);

        Employee max = new Employee("", 20, 0);
        for (Employee e : set) {
            if (max.getSalary() < e.getSalary()) {
                max = e;
            }
        }
        System.out.println("---------------------------");
        System.out.println(max);
    }
}
