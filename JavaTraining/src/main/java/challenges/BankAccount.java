package challenges;

public class BankAccount {
    private String accountNumber;
    private static double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        accountBalance += depositAmount;

        System.out.println("Deposit of $ " + depositAmount + " made. New balance: " + accountBalance);
    }

    public void withdrawFunds(double withdrawalAmount){

        if(accountBalance - withdrawalAmount < 0){
            System.out.println("You are short of money! " + accountBalance);
        }else{
        accountBalance -= withdrawalAmount;
        System.out.println("Withdrawal of $ " + withdrawalAmount + " made. New balance: " + accountBalance);
    }
    }
}
