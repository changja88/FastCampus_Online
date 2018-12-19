package fast.campus.fast.myapplication;

import java.util.ArrayList;

public class Array_ {


    public static void main1(String[] args) {


        ArrayList<Integer> ints = new ArrayList<Integer>();
        ArrayList ints2 = new ArrayList();

        ints.add(2); //index 0
        ints.add(3); //index 1
//        ints.add(true);

        System.out.println(ints);


        ints2.add(2);
        ints2.add(3);
        ints2.add(true);

        System.out.println(ints2);


        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) == 2) {
                System.out.println("2를 찾았다");
            }
        }

        ints.remove(0);
        System.out.println(ints);


    }


}
