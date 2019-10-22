package javaStudy17_exception;

public class Exception2 {
    public static void main(String[] args){
        ArithmeticException e2 = new ArithmeticException();
        try {
            throw e2;
        }
//        int a = 1;try-catch cannot separation
        catch(ArithmeticException e){
            System.out.println("");
        }
    }
}
