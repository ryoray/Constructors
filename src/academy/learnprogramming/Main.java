package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setBalance(1000);
        bankAccount.depositFunds(250000000);
        bankAccount.withdrawFunds(200);
        bankAccount.withdrawFunds(200);

        bankAccount.setAccountNumber(1234567890);
        bankAccount.setEmail("iyok@email.com");
        bankAccount.setName("Mas Iyok");
        bankAccount.setPhone("0811775880");

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getPhone());
        System.out.println(bankAccount.getBalance());
    }
}
