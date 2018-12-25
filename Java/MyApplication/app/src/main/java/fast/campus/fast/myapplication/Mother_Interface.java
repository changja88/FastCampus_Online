package fast.campus.fast.myapplication;

public class Mother_Interface implements Human_Interface {

    @Override
    public void eat() {
        System.out.println("어머니가 먹는다");
    }

    @Override
    public void sleep() {
        System.out.println("어머니가 잔다");
    }

    @Override
    public void wash() {
        System.out.println("어머니가 씻는다");
    }
}
