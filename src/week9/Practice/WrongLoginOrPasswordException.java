package week9.Practice;

public class WrongLoginOrPasswordException extends Exception {
    public WrongLoginOrPasswordException(String message) {
        super(message);
    }
}
