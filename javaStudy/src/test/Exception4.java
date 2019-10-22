package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double cha;
        ArrayList<Double> nums = new ArrayList<>();

            while ((cha = scan.nextDouble()) > 0) {
                nums.add(cha);
            }
            for (Double s : nums) {
                System.out.println(s);
            }
//        System.out.println("please enter again");

    }
}
