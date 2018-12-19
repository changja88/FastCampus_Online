package fast.campus.fast.myapplication;

public class Method {


    public int plus(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    public void plus1(int a, int b) {
        int result;
        result = a + b;
    }

    public static void main1(String[] args) {

        new Method().plus(10, 20);
        new Method().plus1(30, 40);

        int number1;
        int number2;

        number1 = new Method().plus(100, 100);
        number2 = new Method().plus(50, 50);


        System.out.println(number1);
        System.out.println(number2);

    }


}
