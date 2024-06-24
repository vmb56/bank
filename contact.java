
package BankManager;
public class BankManager {

   
    static class BankAccount {
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

        @Override
        public String toString() {
            return "Account: " + account + ", Balance: " + balance;
        }
    }

    
    static class CheckingAccount extends BankAccount {
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

        @Override
        public String toString() {
            return super.toString() + ", Limit: " + limit;
        }
    }

    
    static class SavingsAccount extends BankAccount {
        public SavingsAccount(String account, double balance) {
            super(account, balance);
        }
    }

    
    static class COD extends BankAccount {
        public COD(String account, double balance) {
            super(account, balance);
        }
    }

    public static void main(String[] args) {
        
        CheckingAccount checkingAccount = new CheckingAccount("CHK123", 1500.0, 500.0);
        System.out.println("Checking Account: " + checkingAccount);

    
        SavingsAccount savingsAccount = new SavingsAccount("SAV456", 3000.0);
        System.out.println("Savings Account: " + savingsAccount);

      
        COD cod = new COD("COD789", 10000.0);
        System.out.println("COD Account: " + cod);
    }
}
