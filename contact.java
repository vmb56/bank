// Classe BankAccount
class BankAccount {
    protected String account;
    protected double balance;

    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Classe CheckingAccount (Compte Courant)
class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}

// Classe SavingsAccount (Compte d'épargne)
class SavingsAccount extends BankAccount {
    public SavingsAccount(String account, double balance) {
        super(account, balance);
    }
}

// Classe COD (Certificat de Dépôt)
class COD extends BankAccount {
    public COD(String account, double balance) {
        super(account, balance);
    }
}

// Classe principale BankManager
public class BankManager {
    public static void main(String[] args) {
        // Création d'une instance de CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount("CHK123", 1500.0, 500.0);
        System.out.println("Checking Account: " + checkingAccount.getAccount() + ", Balance: " + checkingAccount.getBalance() + ", Limit: " + checkingAccount.getLimit());

        // Création d'une instance de SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("SAV456", 3000.0);
        System.out.println("Savings Account: " + savingsAccount.getAccount() + ", Balance: " + savingsAccount.getBalance());

        // Création d'une instance de COD
        COD cod = new COD("COD789", 10000.0);
        System.out.println("COD Account: " + cod.getAccount() + ", Balance: " + cod.getBalance());
    }
}
