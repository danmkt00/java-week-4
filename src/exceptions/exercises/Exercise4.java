package exceptions.exercises;

/**
 * Exercise 4 :
 * Create a class BankAccount with:
 *   - field double balance
 *   - method withdraw(double amount)
 *     → If amount > balance, throw a custom exception InsufficientFundsException.
 * In main():
 *   - Create an account with a starting balance
 *   - Try to withdraw more than available
 *   - Catch and handle the exception
 */

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount
{
    private double balance = 0;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance)
        {
            throw new InsufficientFundsException("Not enough balance! Available: " + balance);
        }else{
            balance-=amount;
            System.out.println("Withdrawn: " + amount + ", Remaining balance: " + balance);
        }
    }
}

public class Exercise4
{
    public static void main(String[] args)
    {
        try {
            BankAccount bankAccount = new BankAccount(300);
            bankAccount.withdraw(250);
            bankAccount.withdraw(100);
        }catch (InsufficientFundsException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}





