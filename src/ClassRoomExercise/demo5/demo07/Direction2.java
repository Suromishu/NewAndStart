package ClassRoomExercise.demo5.demo07;

public enum Direction2 {
    NORTH(8, "北"),
    SOUTH(2, "南"),
    EAST(4, "东"),
    WEST(6, "西");

    private int value;
    private String name;

    Direction2() {

    }
    Direction2(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
