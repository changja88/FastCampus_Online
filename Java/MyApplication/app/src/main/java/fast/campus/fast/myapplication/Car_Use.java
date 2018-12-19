package fast.campus.fast.myapplication;

public class Car_Use {


    public static void main1(String[] args) {


        Car normalCar = new Car(4, "일반 엔진", "브레이크", "핸들");
        Car superCar = new Car(4, "슈퍼 에진", true, "브레이크", "핸들");

        normalCar.goForward();
        superCar.goBackward();
        superCar.isSuperCar();


    }


}
