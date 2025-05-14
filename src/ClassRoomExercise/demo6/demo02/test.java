package ClassRoomExercise.demo6.demo02;

public class test {
    public static void main(String[] args) {
        AddInter addInter = (a, b, c) -> {
            return a + b + c;
        };

        AddInter addInter2 = (a, b, c) -> a + b + c;
        System.out.println(addInter.add(1, 2, 3));

        ((AddInter) (a, b, c) -> a + b + c).add(4, 5, 6);
    }
}
