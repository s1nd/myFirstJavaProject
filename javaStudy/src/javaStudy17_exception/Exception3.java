package javaStudy17_exception;

public class Exception3 {
    public static void main(String[] args){
//        try{
//            int a = 1/0;
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Arrayindex is out of boundy");
//        }catch(ArithmeticException e){
//            System.out.println("fenzi is 0");
//        }finally{
//            System.out.println("end");
//        }

        try{
            throw (new ArrayIndexOutOfBoundsException());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("grasp the error");
        }finally{
            System.out.println("end");
        }
    }
}
