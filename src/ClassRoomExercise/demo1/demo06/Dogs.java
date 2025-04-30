package ClassRoomExercise.demo1.demo06;

public class Dogs extends Animals implements Swim{
    private String color;
    private BodyType bodyType;

    public Dogs() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("狗吃狗粮");
    }

    @Override
    public void sleep() {
        System.out.println("狗睡觉");
    }

    @Override
    public void swim() {
        System.out.println("狗会游泳");
    }

    public Dogs(String name, int age, String color, BodyType bodyType) {
        super(name, age);
        this.color = color;
        this.bodyType = bodyType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
