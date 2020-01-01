package test;

public class Var0 {
    public static void main(String[] args){
//        System.out.println(a);//a没有定义
        var a = 1;
//        a = "2";//类型不匹配
        var b = "HaHa";
        System.out.println(a);
        System.out.println(b);
        {
            var c = 2;
        }
//        System.out.println(c);//c没有定义
    }
}
