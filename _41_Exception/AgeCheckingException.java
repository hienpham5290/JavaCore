package _41_Exception;

public class AgeCheckingException extends Exception {
    public AgeCheckingException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Tuổi nhập vào không hợp lệ: " + super.getMessage();
    }
}
