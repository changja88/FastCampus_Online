package fast.campus.fast.myapplication;

import java.util.ArrayList;

public class Mid_Test {


    public static void main(String[] args) {


        // 문제 1번
        ArrayList<Integer> q1_list1 = new ArrayList<>();
//        q1_list1.add(0);
//        q1_list1.add(1);
//        q1_list1.add(2);
//        q1_list1.add(3);
        for (int i = 0; i < 10; i++) {
            q1_list1.add(i);
        }
        ArrayList<Boolean> q1_list2 = new ArrayList<>();
        for (int i = 0; i < q1_list1.size(); i++) {
            if (q1_list1.get(i) < 5) {
                q1_list2.add(true);
            } else {
                q1_list2.add(false);
            }
        }
        System.out.println(q1_list2);

        // 문제 2번
        ArrayList<Integer> q2_list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            q2_list1.add(i);
        }
        System.out.println(howManyOdds(q2_list1));

        // 문제 3번
        ArrayList<Integer> q3_list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            q3_list1.add(i);
        }
        ArrayList<Integer> q3_list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            q3_list2.add(9 - i);
        }
        System.out.println(q3_list1);
        System.out.println(q3_list2);
        multipleTwoArrayLists(q3_list1, q3_list2);

    }

    // 문제 2번
    public static int howManyOdds(ArrayList<Integer> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                result++;
            }
        }
        return result;
    }

    // 문제 3번
    public static void multipleTwoArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            int reuslt = list1.get(i) * list2.get(i);
            System.out.println(reuslt);
        }
    }


}
