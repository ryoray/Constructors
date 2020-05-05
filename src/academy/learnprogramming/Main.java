package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        BankAccount iyokAccount = new BankAccount("1234567890",
//                2000000,"Mas Iyok","iyok@email.com","0811775880");

//        iyokAccount.setAccountNumber(1234567890);
//        iyokAccount.setBalance(2000000);
//        iyokAccount.setEmail("iyok@email.com");
//        iyokAccount.setName("Mas Iyok");
//        iyokAccount.setPhone("0811775880");

//        System.out.println(iyokAccount.getAccountNumber());
//        System.out.println(iyokAccount.getName());
//        System.out.println(iyokAccount.getEmail());
//        System.out.println(iyokAccount.getPhone());
//        System.out.println(iyokAccount.getBalance());
//
//        iyokAccount.depositFunds(1000000);
//        System.out.println("Current balance= " + iyokAccount.getBalance());
//
//        iyokAccount.withdrawFunds(500000);
//        System.out.println("Current balance= " + iyokAccount.getBalance());
//
//        BankAccount pramAccount = new BankAccount("Pram","pram@email.com","0811775880");
//        System.out.println(pramAccount.getAccountNumber() + " name " + pramAccount.getName());

        VipCustomer defaultVipCustomer = new VipCustomer();

        System.out.println(defaultVipCustomer.getName());
        System.out.println(defaultVipCustomer.getCreditLimit());
        System.out.println(defaultVipCustomer.getEmailAddress());

        VipCustomer updatedVipCustomer = new VipCustomer("NewVip1",
                "newemail1@email.com");

        System.out.println(updatedVipCustomer.getName());
        System.out.println(updatedVipCustomer.getCreditLimit());
        System.out.println(updatedVipCustomer.getEmailAddress());

        VipCustomer thirdVipCustomer = new VipCustomer("ThirdVip",
                3000000,"third@email.com");
        System.out.println(thirdVipCustomer.getName());
        System.out.println(thirdVipCustomer.getCreditLimit());
        System.out.println(thirdVipCustomer.getEmailAddress());

//        VipCustomer vipCustomer = new VipCustomer("VIP Joel",100000,
//                "vipjoel@email.com");
//
//        System.out.println(vipCustomer.getName());
//        System.out.println(vipCustomer.getCreditLimit());
//        System.out.println(vipCustomer.getEmailAddress());

        

    }
}
