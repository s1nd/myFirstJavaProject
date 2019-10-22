package javaStudy15_collection;

import java.util.HashMap;
import java.util.Map;
public class MapPro {
    public static void main(String[] args){
        weiLong big = new weiLong("damianjin",5);
        weiLong medium = new weiLong("damianjin",5);
        weiLong small = new weiLong("xiaomianjin",3);

        java.util.Map<Integer ,weiLong> map1 = new HashMap<>();

        map1.put(0,big);

//        返回一个卫龙实例
        weiLong latiao = map1.get(0);
        boolean exists = map1.containsKey(0);
//        System.out.println(exists);
//        System.out.println(latiao.name);

//        覆盖原来的值,所以key不会重复
        map1.put(0,small);
//        System.out.println(map1.get(0).name);

//        遍历map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B",66);
        map2.put("A",65);
        map2.put("C",67);
        map2.put("D",67);
        for(String key:map2.keySet()){
            Integer val = map2.get(key);
            System.out.println(key + ":" +val);
        }
    }
}


class weiLong{
    String name;
    int price;
    weiLong(String laTiao, int price){
        this.name = laTiao;
        this.price = price;
    }
}