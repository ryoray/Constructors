package academy.learnprogramming;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this.name = "Default name";
        this.creditLimit = 100000;
        this.emailAddress = "default@email.com";
    }

    public VipCustomer(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = 2000000;
    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
