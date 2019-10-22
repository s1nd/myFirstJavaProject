package test;

public class Test {
    public static void main(String[] args){
//        void pr(){
//            System.out.println("hello");
//        }
//        pr()
        class ban{
//            inner class can not have static declaration
             void p(){
                System.out.println("inner class");
            }
        }
        var ban2 = new ban();
        ban2.p();
    }
}
