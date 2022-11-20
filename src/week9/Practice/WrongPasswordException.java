package week9.Practice;

public class WrongPasswordException extends Exception {
    String message;
    public WrongPasswordException(String message) {
        this.message = message;
    }
}
