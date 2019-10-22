package hw_hashcode_equals;

import java.util.HashSet;
public class knowEquals {
    public static void main(String[] args){

        Cat cat1 = new Cat("orange");
        Cat copyCat = cat1;
        Cat cat2 = new Cat("orange");
        Cat Tom = new Cat("unknow", "tom");
        Cat StarCat = new Cat("unknow", "StarCat");
        Cat Tomcat = new Cat("unknow", "tom");

        //equals  compare memory address
        boolean test = Tom.equals(cat1);//false
        boolean test1 = Tom.equals(Tomcat);//false
        boolean test2 = cat1.equals(copyCat);//true
//        System.out.println(test1);
//        System.out.println(test);

        HashSet<Cat> cat = new HashSet<Cat>();
//        size=1
        cat.add(Tom);
        cat.add(Tomcat);
        System.out.println(Tom.name);
//        size=2
        cat.add(cat1);
        cat.add(copyCat);

//        size =1
        System.out.println(cat1.hashCode());
        cat1.name = "garfield";
        System.out.println(cat1.hashCode());
//        cat.remove(cat1);

//        没有发生内存泄漏
        {
            cat1.name = "StarCat";
            cat.remove(cat1);
        }


//        false
//        System.out.println(Tom.equals(Tomcat));
        System.out.println(cat.size());
//          System.out.println(cat1.hashCode());
    }
}


class Cat{
    String type = "";
    String name = "";
    Cat(String type){
        this.type = type;
    }
    Cat(String type, String name){
        this.type = type;
        this.name = name;
    }
    @Override
    //you must set equals as "public"?
    public boolean equals(Object obj){
        if(obj == null)return false;

//        System.out.println(obj);
//        System.out.println(this);
        if(obj == this)return true;

//        this.getClass()==getClass()
        if(obj.getClass() != getClass())return false;

        final Cat other = (Cat) obj;

        if(other.name == this.name && other.type == this.type){
            return true;

        }
        return false;
    }
//    @Override
//    public int hashCode(){
//        return 1;
//    }
//    Object allProperty(Object obj) {
//        if (true) {
//
//        } else {
//
//        }
//    }
}