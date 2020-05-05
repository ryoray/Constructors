package academy.learnprogramming;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    // More efficient way to set initial value of the fields
    // is by using constructors

    public BankAccount(){
        this("123456", 2500,"Suryo",
                "suryo@email.com","(245)1234567");
    }

    public BankAccount(String accountNumber, double balance,
                       String name, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount(String name, String email, String phone) {
        this("99999",1000,name,email,phone);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
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
        }
    }
}
