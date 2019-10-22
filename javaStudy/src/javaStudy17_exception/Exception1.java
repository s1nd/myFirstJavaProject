package javaStudy17_exception;

public class Exception1 {
    public static void main(String[] args)
            //throws is useless
            throws ArithmeticException,ArrayIndexOutOfBoundsException
    {
                int a = 1, b = 0;
                int[] c = {1, 2, 3};
                ArithmeticException e1 = new ArithmeticException();
                System.out.println("before ArithmeticException");
        //        System.out.println(a/b);
//               System.out.print(c[3]);


    }
}
