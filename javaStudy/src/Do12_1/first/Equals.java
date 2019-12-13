package Do12_1.first;

public class Equals {
    public static void main(String[] args){
        Students joan = new Students("joan");
        joan.setAge(12);
        Students joan1 = new Students("joan");
        joan1.setAge(10);
        boolean res = joan.equals(joan1);
//        System.out.println(joan.getAge());
//        System.out.println(joan.age);
        joan.getAge();
        joan1.getAge();
        System.out.print(res);
    }
}
