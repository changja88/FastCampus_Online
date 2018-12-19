package fast.campus.fast.myapplication;

public class Car {

    int tires;
    String engine;
    Boolean superEngine;
    String break_;
    String handle;

    public Car(int tires, String engine, String break_, String handle) {
        this.tires = tires;
        this.engine = engine;
        this.break_ = break_;
        this.handle = handle;
    }

    public Car(int tires, String engine, Boolean superEngine, String break_, String handle) {
        this.tires = tires;
        this.engine = engine;
        this.superEngine = superEngine;
        this.break_ = break_;
        this.handle = handle;
    }


    public void goForward() {
        System.out.println("직진 합니다");
    }

    public void goBackward() {
        System.out.println("후진 합니다");
    }

    public void isSuperCar() {
        if (superEngine == true) {
            System.out.println("슈퍼카 입니다");
        } else {
            System.out.println("슈퍼카가 아닙니다");

        }
    }


}
