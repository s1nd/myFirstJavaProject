package javaStudy17_exception;

import java.util.*;

public class Exception4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double cha;
        ArrayList<Double> nums = new ArrayList<>();

        try{
            while((cha=scan.nextDouble())>0){
                nums.add(cha);
            }
        }catch (InputMismatchException e){
            for(Double s:nums){
                System.out.println(s);
            }
//            System.out.println();
        }
    }
}
