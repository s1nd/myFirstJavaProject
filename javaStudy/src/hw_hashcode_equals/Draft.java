package hw_hashcode_equals;

public class Draft {
    @Override
    public int hashCode() {
//        return super.hashCode();
        return 2;
    }
    public  void getCl(){
        System.out.println(getClass());
        System.out.println(this.getClass());
    }
    public static void main(String[] main){
//        hashCode function already been Overrided
        Draft d = new Draft();
        int hash = d.hashCode();
//        System.out.println(hash);

        Dog dog1 = new Dog();
        d.getCl();
    }
}

class Dog{
    String type ="";
    void dogType(String type){
        this.type = type;
    }
}