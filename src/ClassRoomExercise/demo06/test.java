package ClassRoomExercise.demo06;

public class test {
    public static void main(String[] args) {
        Dogs dog = new Dogs("旺财", 3, "白色", BodyType.MEDIUM);
        dog.eat();
        dog.swim();

        Cats cat = new Cats("小花", 2, "黑色");
        cat.eat();
    }
}
