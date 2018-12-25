package fast.campus.fast.myapplication;

public class Mother extends Human {

    public Mother() {

    }


    public void cook() {
        System.out.println("요리한다");
    }

    @Override
    public void eat() {
        System.out.println("적게 먹는다");
    }


}
