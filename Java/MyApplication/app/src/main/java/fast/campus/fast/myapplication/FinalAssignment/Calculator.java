package fast.campus.fast.myapplication.FinalAssignment;

public class Calculator implements CalculatorInterface {


    public Calculator() {
    }

    @Override
    public int sum(int first, int second) {
        return first + second;
    }

    @Override
    public int minus(int first, int second) {
        return first - second;
    }
}
