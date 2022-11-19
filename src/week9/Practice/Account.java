package week9.Practice;

public class Account {
    String login;
    String password;

    void checkLogin(String userLogin) throws WrongLoginException {
        if (userLogin != null && userLogin.length() > 5 && userLogin.length() < 20) {
            this.login = userLogin;
            System.out.println(" password: " + this.login);

        } else {
            System.out.println("Your login should be more than 5 and less than 20 characters");
            throw new WrongLoginException();
        }
    }

    void checkPassword(String userPassword, String userPasswordConfirmation) throws WrongLoginException {
        if (userPassword != null && userPassword.length() > 8 && userPassword.length() < 20 && userPassword.equals(userPasswordConfirmation)) {
            this.password = userPassword;
            System.out.println(" password: " + this.password);
        } else {
            System.out.println("Oops, looks like there is something wrong with your password");
            throw new WrongLoginException();
        }
    }

    public static void main(String[] args) {
        Account newUser = new Account();
        try {
//            newUser.checkLogin("apple");
            newUser.checkLogin("watermelon");
            newUser.checkPassword("myPassword1", "myPassword");
        } catch (WrongLoginException e) {
            System.out.println("Exception: " + e);
        }
    }
}
