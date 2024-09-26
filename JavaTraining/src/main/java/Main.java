import challenges.BankAccount;

public class Main {
    public static void main(String[] args) {


        BankAccount olyasAccount = new BankAccount();
        olyasAccount.depositFunds(250.25);
        olyasAccount.depositFunds(75.85);
        olyasAccount.withdrawFunds(50);
        olyasAccount.withdrawFunds(280);
    }
}