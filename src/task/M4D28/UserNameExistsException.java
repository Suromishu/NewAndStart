package task.M4D28;

public class UserNameExistsException extends RuntimeException {
    public UserNameExistsException() {
        super("用户名被占用");
    }
    public UserNameExistsException(String message) {
        super(message);
    }
}
