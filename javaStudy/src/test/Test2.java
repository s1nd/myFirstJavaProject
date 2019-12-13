package test;

public class Test2 {
    public static void T(){
        System.out.println("T");
    }
    public static void main(String[] args){
//        静态方法可以通过对象调用
        (new Test2()).T();
        T();
    }
}
