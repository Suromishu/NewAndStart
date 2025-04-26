package task.M4D26;

public class demo02 {
    public static void main(String[] args) {
        System.out.println(tempRandom());
    }

    public static int tempRandom() {
        return (int) (Math.random() * 100) + 50;
    }
}
