package week9.Practice;

public class Account {
    String login;

//    public Account(String login) {
//        this.login = login;
//    }

    void checkLogin(String userLogin) throws WrongLoginException {
        if (userLogin != null && userLogin.length() > 5 && userLogin.length() < 20) {
            this.login = userLogin;
            System.out.println(this.login);
        } else {
            System.out.println("Your login should be more than 5 and less than 20 characters");
            throw new WrongLoginException();
        }
    }

    public static void main(String[] args) {
        Account newUser = new Account();
        try {
            newUser.checkLogin("hello");
        } catch (WrongLoginException e) {
            System.out.println("Exception: " + e);
        }
    }
}
