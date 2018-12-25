package fast.campus.fast.myapplication;

public class Bank_User {


    public static void main(String[] args) {

        Bank bank = new Bank();


        int customerMoney = bank.checkCustomerMoney();
        System.out.println(customerMoney);



    }

}
