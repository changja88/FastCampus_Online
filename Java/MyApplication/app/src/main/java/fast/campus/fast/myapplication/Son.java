package fast.campus.fast.myapplication;

public class Son extends Human {

    public Son() {

    }

    public void study() {
        System.out.println("공부한다");
    }

    @Override
    public void eat() {
        System.out.println("매우 많이 먹는다");
    }
}
