package test;

import java.util.InputMismatchException;
import java.util.Scanner;
//exception-->triangle
public class Scanner1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        scan.hasNextInt();
        try {
        int a = scan.nextInt();
        if(scan.hasNextInt()) {
                System.out.println(a);
        }else{
            System.out.println("no more number");
        }

        }catch(InputMismatchException e){
            System.out.println("type not match");
        }

    }
}
