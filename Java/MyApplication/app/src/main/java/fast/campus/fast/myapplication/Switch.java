package fast.campus.fast.myapplication;

public class Switch {

    public static void main1(String[] args) {


        int money = 5000;
        switch (money) {

            case 10000:
                System.out.println("돈가를 먹는다");
                break;

            case 5000:
                System.out.println("국밥을 먹는다");
                break;

            case 1000:
                System.out.println("라면을 먹는다");
                break;

            default:
                System.out.println("먹지 않는다");
                break;

        }

    }

}
