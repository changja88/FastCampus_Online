package fast.campus.fast.myapplication;

public class Bank {


    private int cutomerMoney = 1000;


    public int checkCustomerMoney() {
        return cutomerMoney;
    }


    public void transferMoney(int cutomerMoney) {
        if (certificate() == true) {
            if (otp() == true) {
                System.out.println("송금");
            }
        }
    }

    private boolean certificate() {
        return true;
    }

    private boolean otp() {
        return true;
    }

}
