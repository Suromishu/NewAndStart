package task.M5D13.demo04;

public class Dogs extends Animals{
    private String color;

    private Dogs() {
        super();
    }
    public Dogs(String name, int age) {
        super(name, age);
    }
    private Dogs(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void swim() {
        System.out.println("狗会游泳");
    }

    private void show() {
        System.out.println(getName() + "::" + getAge() + "::" + getColor());
    }
}
