package fast.campus.fast.myapplication.FinalAssignment;

public class Main {


    public static void main(String[] args) {


        Account customerAccount = new Account(10000);
        Customer customer = new Customer(customerAccount);
        Banker banker = new Banker();

        banker.save(customer.account, 5000);
        int result = customer.checkAccount();
        System.out.println(result);

        banker.withdraw(customer.account, 10000);
        int result2 = customer.checkAccount();
        System.out.println(result2);

    }
}
