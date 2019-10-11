package javaStudy15_collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class C_List {
    public static void main(String[] args){
//        1.List declaration
//        generics
        List<String> sls = new ArrayList();
        List Als = new LinkedList<>();
        List ls = new ArrayList();
        List<String> simpleLs = List.of("tom","jerry","doge");

//        2.methods
//        ls[0] = 0; error
        ls.add(0);
        ls.add(0);
//        you can add null
        ls.add(null);
        ls.add(1,2);
//        remove method return Object, delete according to index
        Object remove = ls.remove(0);

//        3.traversing
//        for(byte i=0;i<ls.size();i++){
//            System.out.println(ls.get(i));
//        }
//
//        for(;simpleLs.iterator().hasNext();){
//            String s = simpleLs.iterator().next();
//            System.out.println(s);
//        }

        /*
        simpleLs.iterator().next();
        simpleLs.iterator().next();
        System.out.println(simpleLs.iterator().next());
        Iterator<String> it = simpleLs.iterator();
        */


//        return the next element
        /*
        it.next();  #list[0]
        it.next();  #list[1]
        System.out.println(it.next());
       */

        /*
        for(Iterator<String> it = simpleLs.iterator();it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }
        */

        for(String who:simpleLs){
            System.out.println(who);
        }
    }
}
