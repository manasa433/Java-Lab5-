1Q.

// BankInterface.java - Interface for Bank operations
public interface BankInterface {
    double getBalance();          
    double getInterestRate();    
}

// BankA.java - Class that implements BankInterface for Bank A
public class BankA implements BankInterface {
    private double balance;

    // Constructor
    public BankA(double balance) {
        this.balance = balance;
    }

    // Implement getBalance method
    @Override
    public double getBalance() {
        return balance;
    }

    // Implement getInterestRate method (7%)
    @Override
    public double getInterestRate() {
        return 7.0;
    }
}

// BankB.java 
public class BankB implements BankInterface {
    private double balance;

    // Constructor
    public BankB(double balance) {
        this.balance = balance;
    }

    // Implement getBalance method
    @Override
    public double getBalance() {
        return balance;
    }

    // Implement getInterestRate method (7.4%)
    @Override
    public double getInterestRate() {
        return 7.4;
    }
}

// BankC.java - Class that implements BankInterface for Bank C
public class BankC implements BankInterface {
    private double balance;

    // Constructor
    public BankC(double balance) {
        this.balance = balance;
    }

    // Implement getBalance method
    @Override
    public double getBalance() {
        return balance;
    }

    // Implement getInterestRate method (7.9%)
    @Override
    public double getInterestRate() {
        return 7.9;
    }
}

// BankTest.java - Main class to test BankInterface implementation
public class BankTest {
    public static void main(String[] args) {
        // Creating instances of each bank with deposit amounts
        BankInterface bankA = new BankA(10000);
        BankInterface bankB = new BankB(150000);
        BankInterface bankC = new BankC(200000);

        // Displaying the balance and interest rate for each bank
        System.out.println("Bank A:");
        System.out.println("Balance: " + bankA.getBalance());
        System.out.println("Interest Rate: " + bankA.getInterestRate() + "%");

        System.out.println("\nBank B:");
        System.out.println("Balance: " + bankB.getBalance());
        System.out.println("Interest Rate: " + bankB.getInterestRate() + "%");

        System.out.println("\nBank C:");
        System.out.println("Balance: " + bankC.getBalance());
        System.out.println("Interest Rate: " + bankC.getInterestRate() + "%");
    }
}

