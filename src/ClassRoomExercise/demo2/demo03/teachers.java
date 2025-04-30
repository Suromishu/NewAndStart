package ClassRoomExercise.demo2.demo03;

public class teachers implements Comparable<teachers>{
    private String name;
    private int age;

    public teachers() {

    }
    public teachers(String name, int age) {
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
        this.age = age;
    }

    @Override
    public String toString() {
        return "teachers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(teachers o) {
        return this.age - o.age;
    }
}
