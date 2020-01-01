package test;

public class Scope {
    public static void main(String[] args) {
        var a = 0;
        {
            a = 1;
        }
        System.out.println(a);//1
    }
}
