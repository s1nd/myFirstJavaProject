package javaStudy12_inherit;

public class Inherit1 extends father{

    String generation = "son";
    Inherit1(){}
    Inherit1(String ln){
        super("son:" + ln);
    }
    public static void main(String[] args){
        Inherit1 sb = new Inherit1();
        father a = new Inherit1();
        a.fatherYell();
        a.son_fa(sb);
        sb.fatherYell();
        System.out.println(sb.lastName);

        Inherit1 p1  = new Inherit1("dave");
        System.out.println(p1.lastName);
    }
}
class father{
    String lastName = "dai";
    String generation = "father";
    father(){

    }
    father(String ln){
        lastName = ln;
    }
    public void fatherYell(){
        System.out.println("father yell");
    }
    public void son_fa(father a){
        System.out.println(a.generation);
    }
}

class brother{

}
