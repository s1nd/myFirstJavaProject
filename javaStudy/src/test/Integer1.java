package test;

public class Integer1 {
    public static void main(String[] args){
        Integer n =new Integer(1);
        Integer m = n;
        n=2;
        System.out.println(m);//1
        System.out.println((1<<31)-1);
        System.out.println(Integer.MAX_VALUE);
    }
}
