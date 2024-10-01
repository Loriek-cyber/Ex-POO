//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SavingAccount account1 = new SavingAccount(1700,"Arjel");
        System.out.println(account1.getBalance());
        System.out.println(account1.interest(10));
        System.out.println(account1.getBalance());
    }
    public static class BankAccount {
        private final int accountNumber;
        private final String name;
        public double balance;

        public BankAccount(int accountNumber, String name, double balance) {
            this.accountNumber = accountNumber;
            this.name = name;
            this.balance = balance;
        }
        public int getAccountNumber() {
            return accountNumber;
        }
        public String getName() {
            return name;
        }
        public double getBalance() {
            return balance;
        }
        public void deposit(double amount) {
            balance+=amount;
        }
    }
    /**Rapresentazione in java di un account deposito di un cliente*/
    public static class SavingAccount{
        private double balance; // Saldo
        private String name; // Nome
        public SavingAccount(double balance, String name) {
            this.balance = balance;
            this.name = name;
        }
        /**@return balance*/
        public double getBalance() {
            return balance;
        }
        public double interest(double amount) {
            double interesse = balance/100;
            interesse*=amount;
            balance+=interesse;
            return interesse;
        }
    }
}