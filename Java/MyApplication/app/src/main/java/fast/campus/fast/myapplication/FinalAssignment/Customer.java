package fast.campus.fast.myapplication.FinalAssignment;

public class Customer {

    Account account;

    public Customer(Account account) {
        this.account = account;
    }


    public int checkAccount() {
        return account.money;
    }


}
