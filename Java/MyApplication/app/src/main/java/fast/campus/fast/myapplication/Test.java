package fast.campus.fast.myapplication;

public class Test {


    public static void main1(String[] args) {



    }


    public class Car {

        int tires;
        String engine;
        Boolean superEngine;
        String break_;
        String handel;

        public Car(int tires, String engine, String break_, String handel) {
            this.tires = tires;
            this.engine = engine;
            this.break_ = break_;
            this.handel = handel;
        }

        public Car(int tires, String engine, Boolean superEngine, String break_, String handel) {
            this.tires = tires;
            this.engine = engine;
            this.superEngine = superEngine;
            this.break_ = break_;
            this.handel = handel;
        }

        public void goForward() {
            System.out.println("직진");
        }

        public void goBackward() {
            System.out.println("후진");
        }

        public void isSuperCar() {
            if (superEngine == true) {
                System.out.println("슈퍼카 입니다");
            } else {
                System.out.println("슈퍼카가 아닙니다");
            }
        }

    }

}
