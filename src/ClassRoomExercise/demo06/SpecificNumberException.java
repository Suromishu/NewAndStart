package ClassRoomExercise.demo06;

public class SpecificNumberException extends RuntimeException {
    public SpecificNumberException() {
        super("非法特定数据");
    }
    public SpecificNumberException(String message) {
        super(message);
    }
}