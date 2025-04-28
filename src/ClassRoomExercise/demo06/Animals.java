package ClassRoomExercise.demo06;

public abstract class Animals {

    private String name;
    private int age;

    public Animals() {

    }
    public Animals(String name, int age) {
        checkAge(age);
        this.name = name;
        this.age = age;
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
        checkAge(age);
        this.age = age;
    }

    public abstract void eat();

    public abstract void sleep();

    private void checkAge(int age) {
        if (age < 0 ||  age > 200)
            throw new SpecificNumException("年龄不合法");
    }
}
