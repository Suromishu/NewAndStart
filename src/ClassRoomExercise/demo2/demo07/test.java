package ClassRoomExercise.demo2.demo07;

public class test {
    public static void main(String[] args) {
        Rawtype<String> rawtype = new Rawtype<>();
        rawtype.setT("aaa");
        System.out.println(rawtype.getT());

        Rawtype2<String> rawtype2 = new Rawtype2impl();
        rawtype2.showT("hello");

    }
}