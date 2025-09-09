/**
 * This class demonstrates encapsulation. The data (balance) is kept private,
 * and can only be accessed or modified through public methods like deposit()
 * and getBalance().
 */
class BankAccount {
    /**
     * 1. Data Hiding: The 'balance' variable is private.
     * It cannot be accessed directly from outside this class.
     */
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    /**
     * 2. Public Methods: These provide controlled access to the private data.
     */

    // A 'getter' method to allow read-only access to the balance.
    public double getBalance() {
        return this.balance;
    }

    // A method to deposit money, with validation logic.
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. New balance: " + this.balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // A method to withdraw money, with validation logic.
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + this.balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
        }
    }
}

/**
 * The main class to demonstrate encapsulation in action.
 */
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000.0);

        // You cannot access the private 'balance' field directly.
        // The line below would cause a compile error.
        // myAccount.balance = 5000; // ERROR!

        // You must use the public methods to interact with the object.
        System.out.println("Initial balance: " + myAccount.getBalance());

        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.withdraw(2000.0); // This withdrawal will fail.

        System.out.println("Final balance: " + myAccount.getBalance());
    }
}