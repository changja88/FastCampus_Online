package fast.campus.fast.myapplication;

public class While {


    public static void main1(String[] args) {


        boolean hungry = true;


//        while(hungry == true){
//            System.out.println("돈가스를 한입 먹는다");
//        }


//        while (hungry == true){
//            System.out.println("돈가스를 한입 먹는다");
//            System.out.println("돈가스를 한입 먹는다");
//            System.out.println("돈가스를 한입 먹는다");
//            System.out.println("돈가스를 한입 먹는다");
//            System.out.println("돈가스를 한입 먹는다");
//            break;
//        }


        while (hungry == true) {
            System.out.println("돈가스를 한입 먹는다");
            System.out.println("돈가스를 한입 먹는다");
            System.out.println("돈가스를 한입 먹는다");
            System.out.println("돈가스를 한입 먹는다");
            System.out.println("돈가스를 한입 먹는다");
            hungry = false;
            continue;
        }


    }

}
