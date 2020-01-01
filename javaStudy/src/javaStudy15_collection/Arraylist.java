package javaStudy15_collection;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> AL = new ArrayList();
        AL.add("hello");
        AL.add("world");
        AL.add(1,"gay");
        System.out.println(AL.get(0));
        System.out.println(AL.get(1));
        ArrayList<Integer> Arr = new ArrayList<>(5);
    }
}
