package week9.Practice;

import java.util.HashMap;
import java.util.Map;

public class Account {
    String login;
    String password;
    HashMap<String, String> loginPasswordPair = new HashMap<>();

    // add some key-pair values to HashMap
    public Account() {
        this.loginPasswordPair.put("watermelon0", "myPassword");
        this.loginPasswordPair.put("watermelon1", "myPassword2");
        this.loginPasswordPair.put("watermelon2", "myPassword3");
    }

    // method to check login
    void checkLogin(String userLogin) throws WrongLoginException {
        if (userLogin != null && userLogin.length() > 5 && userLogin.length() < 20) {
            this.login = userLogin;
            System.out.println(" password: " + this.login);

        } else {
            System.out.println("Your login should be more than 5 and less than 20 characters");
            throw new WrongLoginException();
        }
    }

    // method to check password

    void checkPassword(String userPassword, String userPasswordConfirmation) throws WrongPasswordException {
        if (userPassword != null && userPassword.length() > 8 && userPassword.length() < 20 && userPassword.equals(userPasswordConfirmation)) {
            this.password = userPassword;
            System.out.println(" password: " + this.password);
        } else {
            System.out.println("Oops, looks like there is something wrong with your password");
            throw new WrongPasswordException();
        }
    }

    // method to check if login or password is in HashMap

    void checkLoginAndPassword(String userLogin, String userPassword) throws WrongLoginOrPasswordException {

        String uPassword = loginPasswordPair.get(userLogin);
        if (userPassword.equals(uPassword)) {
            System.out.println("Welcome to your account!");
        } else if (uPassword == null) {
            System.out.println("This username doesn't exist");
        } else {
            System.out.println("Wrong password");
            throw new WrongLoginOrPasswordException();
        }

    }

    public static void main(String[] args) {
        Account newUser = new Account();

        try {
            newUser.checkLogin("apple");
            newUser.checkLoginAndPassword("watermelon", "myPassword");
            newUser.checkLogin("watermelon");
            newUser.checkPassword("myPassword1", "myPassword");
        } catch (WrongLoginException e) {
            System.out.println("Exception: " + e);
        } catch (WrongPasswordException e) {
            System.out.println("Exception: " + e);
        } catch (WrongLoginOrPasswordException e) {
            System.out.println("Exception: " + e);
        }
    }
}
