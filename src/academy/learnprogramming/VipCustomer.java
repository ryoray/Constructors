package academy.learnprogramming;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer() {
        // First way to initialize value into the fiels
        this("Default name", 1000000,"default@email.com");

//        The other way for value initialization
//        this.name = "Default name";
//        this.creditLimit = 100000;
//        this.emailAddress = "default@email.com";
    }

    public VipCustomer(String name, String emailAddress) {
       this(name, 2000000, emailAddress);   // Adding default value for credit limit only
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
