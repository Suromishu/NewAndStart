package ClassRoomExercise.demo5.demo02;

public class Students extends Person{
    private int score;
    private String sex;

    private Students() {

    }

    private Students(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public Students(String name, int age, int score, String sex) {
        super(name, age);
        this.score = score;
        this.sex = sex;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void study() {
        System.out.println("study");
    }

    private void show() {
        System.out.println("姓名：" + getName() + ", 年龄：" + getAge() + ", 成绩：" + score);
    }
}
