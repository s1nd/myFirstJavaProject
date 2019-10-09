package javaStudy13_abstract;

public abstract class Abstract {
    abstract void run();
}
class Plate extends Abstract{
    void run(){
        System.out.println("rotate");
    }
}
class Wheels extends Abstract{
    void run(){
        System.out.println("run run");
    }
    public static void main(String[] args){
        Wheels car = new Wheels();
        Abstract wan = new Plate();
//        wan.run();
//        car.run();

//        如果存在未赋值的元素，报空指针异常错误
        Abstract[] family = new Abstract[2];
        family[0] = car;
        family[1] = wan;

//        type item:array
        for(Abstract x: family){
            x.run();
        }

    }
}

