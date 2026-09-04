class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal exceeds balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful, remaining balance: " + balance);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Account acc = new Account(5000);
        try {
            acc.withdraw(6000);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}