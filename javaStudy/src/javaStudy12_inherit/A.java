package javaStudy12_inherit;

public class A extends B{
    public A(){
//        super();
        System.out.println("A");

    }
    public void same(){
        System.out.println("the same of A");

    }
    public static void main(String[] args){
        A test = new A();
        test.same();
    }
}
class B {
    public B() {
        System.out.println("B");
    }
    public void same(){
        System.out.println("the same of B");
    }
}
