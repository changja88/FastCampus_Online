package fast.campus.fast.myapplication;

public class Father extends Human {


    public Father() {

    }

    public void work() {
        System.out.println("일한다");
    }

    @Override
    public void eat() {
        System.out.println("많이 먹는다");
    }

    public void wash(String sampoo) {
        System.out.println("샴프로 샤워한다");
    }


}
