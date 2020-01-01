package javaStudy15_collection;

import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args){
        List<String> a = new ArrayList<>();
        List b = List.of(1,"hi","hj");
        for(Object s:b){
//            System.out.println(s);
        }
        //list2array
        Object[] l = b.toArray(new Object[3]);
//        System.out.println(l[0]);

        //array2list read only!
        Integer[] s={1,2,3};
        List list = List.of(s);
        System.out.println(list instanceof ArrayList);
        System.out.println(list.getClass());//java.util.ImmutableCollections$ListN//immutable 不可变的


    }
}
