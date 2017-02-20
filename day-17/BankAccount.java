/*
    3 synchronized statements for each method should be added:
    - deposit & retrieve: to ensure the values are correctly updated internally
    - getBalance: to ensure that any outside operation that checks the balance
      gets the correct value
 */

public class BankAccount {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance = balance + money;
    }

    public int retrieve(int money) {
        int result = 0;
        if (balance > money) {
            result = money;
        } else {
            result = balance;
        }
        balance = balance - result;
        return result;
    }
}