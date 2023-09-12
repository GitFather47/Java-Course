class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: $" + balance;
    }
}

class FixedAccount extends Account {
    private int tenure; // In months

    public FixedAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    public int getTenure() {
        return tenure;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tenure: " + tenure + " months";
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Interest Rate: " + interestRate + "%";
    }
}

public class ObjectCasting1 {
    public static void main(String[] args) {
        Account account1 = new Account("1234567890", 1000);
        Account account2 = new FixedAccount("9876543210", 2000, 12);
        Account account3 = new SavingsAccount("5678901234", 3000, 2.5);

        printAccountDetails(account1);
        printAccountDetails(account2);
        printAccountDetails(account3);
    }

    public static void printAccountDetails(Account account) {
        System.out.println("Account Details: " + account.toString());
        String s1;

        if (account instanceof FixedAccount) {
            FixedAccount fixedAccount = (FixedAccount) account;
            s1=fixedAccount.getTenure() +" ";
            System.out.println("This is a Fixed Account with tenure of " + s1 + " months.");
        } else if (account instanceof SavingsAccount) {
            SavingsAccount savingsAccount = (SavingsAccount) account;
            s1=savingsAccount.getInterestRate()+" ";
            System.out.println("This is a Savings Account with interest rate of " + s1 + "%.");
        }

        System.out.println();
    }
}
