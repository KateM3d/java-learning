package week9.Practice;

public class WrongLoginException extends Exception {

    String message;

    public WrongLoginException(String message) {
        this.message = message;
    }

}
