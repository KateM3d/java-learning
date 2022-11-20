package week9.Practice;

public class WrongLoginOrPasswordException extends Exception {
    String message;

    public WrongLoginOrPasswordException(String message) {
        this.message = message;
    }

}
