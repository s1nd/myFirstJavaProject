package javaStudy16_genertic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Genertic {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("xiaoming");
        //true true
        boolean test1 = list.get(0) instanceof String;
        boolean test2 = list.get(0) instanceof Object;

//        incompatible types
//        String str = list.get(0);

        System.out.println(test1 + " " + test2);

        ArrayList<String> a = new ArrayList<>();
        a.add("xiaohong");
        boolean test3 = list.get(0) instanceof String;
        String str2 = a.get(0);
        System.out.println(test3);

    }
}
