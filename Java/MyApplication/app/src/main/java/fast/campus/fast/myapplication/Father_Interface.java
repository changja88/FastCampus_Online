package fast.campus.fast.myapplication;

public class Father_Interface implements Human_Interface {


    @Override
    public void eat() {
        System.out.println("아버지가 먹는다");
    }

    @Override
    public void sleep() {
        System.out.println("아버지가 잔다");
    }

    @Override
    public void wash() {
        System.out.println("아버지가 씻는다");
    }

}
