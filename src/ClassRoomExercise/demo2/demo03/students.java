package ClassRoomExercise.demo2.demo03;

public class students {
    private String name;
    private int age;
    private teachers teacher;

    public students(){

    }
    public students(String name, int age){
        this.name = name;
        this.age = age;
    }
    public students(String name, int age, teachers teacher){
        this.name = name;
        this.age = age;
        this.teacher = teacher;
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

    public teachers getTeacher() {
        return teacher;
    }

    public void setTeacher(teachers teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                '}';
    }
}
