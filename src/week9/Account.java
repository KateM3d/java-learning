package week9;

public class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    void withdraw(int sum) throws Exception {
        if (sum < 0) {
            System.out.println("The amount cannot be negative");
            throw new Exception();
        }
        balance -= sum;
    }

    public static void main(String[] args) {
        Account account = new Account(100);
        try {
            account.withdraw(-20);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
