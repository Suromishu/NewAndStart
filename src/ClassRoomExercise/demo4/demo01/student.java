package ClassRoomExercise.demo4.demo01;

import java.io.Serializable;

public class student implements Serializable {
    private String name;
    private int age;
    private char gender;

    public student() {

    }
    public student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void show() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，性别：" + gender);
    }
}
