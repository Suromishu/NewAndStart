package ClassRoomExercise.demo1.demo06;

public class Cats extends Animals{
    private String color;

    public Cats() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫在睡觉");
    }

    public Cats(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
