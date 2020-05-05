package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        BankAccount iyokAccount = new BankAccount("1234567890",
                2000000,"Mas Iyok","iyok@email.com","0811775880");

//        iyokAccount.setAccountNumber(1234567890);
//        iyokAccount.setBalance(2000000);
//        iyokAccount.setEmail("iyok@email.com");
//        iyokAccount.setName("Mas Iyok");
//        iyokAccount.setPhone("0811775880");

        System.out.println(iyokAccount.getAccountNumber());
        System.out.println(iyokAccount.getName());
        System.out.println(iyokAccount.getEmail());
        System.out.println(iyokAccount.getPhone());
        System.out.println(iyokAccount.getBalance());





    }
}
