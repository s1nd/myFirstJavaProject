package test;

public class This0 {
    public static void main(String[] args){
        This0 t1 = new This0();
//        A t2 = new A();
        t1.th();
//        t2.Th1();

    }
    public void th(){
        System.out.println(this.toString());//test.This0@2d98a335
    }
    class A{
        public void Th1(){
            System.out.println(this);
        }
    }
}
