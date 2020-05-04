package academy.learnprogramming;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void depositFunds (double amount) {
        this.balance += amount;
    }

    public void withdrawFunds (double amount) {
        if (this.balance - amount < 0) {
            System.out.println("There's only " + this.balance + " balance available");
        } else {
            this.balance -= amount;
            System.out.println("Balance = " + this.balance);
        }
    }
}
