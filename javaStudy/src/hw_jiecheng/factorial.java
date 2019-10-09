package hw_jiecheng;

public class factorial {

    private static long jie(int n){
        return n == 1?1:n*jie(n-1);
    }
    private static String erFen(int n){
        String strNum = "hello";
        long endNum = jie(20);

//        long r = endNum%(1e10);

        return strNum;
    }
    public static void main(String []arg){
        long t = jie(20);
        long s = 1;
        int i;
        for(i=1;s>0;i++){
            s *= i;
        }
        System.out.println("i is " + (i-1));
        System.out.println("s is " + s);
        System.out.println("t is " + t);
    }
}
