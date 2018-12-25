package fast.campus.fast.myapplication;

public class Calculator {


    int previousResult;

    public Calculator(int previousResult) {
        this.previousResult = previousResult;
    }

    public void add(int value) {
        previousResult += value;
        minusCheck();
    }

    public void minus(int value) {
        previousResult = previousResult - value;
        minusCheck();
    }

    public void percent(int value) {
        previousResult = previousResult % value;
        minusCheck();
    }

    public void by(int value) {
        previousResult = previousResult / value;
        minusCheck();
    }

    public void multiple(int value) {
        previousResult = previousResult * value;
        minusCheck();
    }

    public void minusCheck() {
        if (previousResult < 0) {
            previousResult = 0;
        }
    }

    public void getResult() {
        System.out.println(previousResult);
    }


}
