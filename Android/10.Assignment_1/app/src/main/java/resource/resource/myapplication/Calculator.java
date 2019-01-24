package resource.resource.myapplication;

import android.util.Log;

public class Calculator {


    private int result = 0;
    private String operator;
    private Integer first = null;
    private Integer sceond = null;

    public void plus(int comingValue) {
        result = first + sceond;
    }

    public void minus(int comingValue) {
        result = result - comingValue;
        Log.d("testtt", "result : " + result);
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int requestResult() {
        return result;
    }

}
