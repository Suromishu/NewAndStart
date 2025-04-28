package ClassRoomExercise.demo06;

public class SpecificNumException extends RuntimeException {
    public SpecificNumException() {
        super("非法特定数据");
    }
    public SpecificNumException(String message) {
        super(message);
    }
}