package fast.campus.fast.myapplication;

public class If {


    public static void main1(String[] args) {


        int money = 5000;
        if (money >= 10000) {
            System.out.println("돈가스를 먹는다");
        }

        if (money >= 10000) {
            System.out.println("돈가스를 먹는다");
        } else {
            System.out.println("국밥을 먹는다");
        }

        if (money >= 10000) {
            System.out.println("돈가스를 먹는다");
        } else if (money >= 5000) {
            System.out.println("국밥을 먹는다");
        } else {
            System.out.println("라면을 먹는다");
        }




    }

}
