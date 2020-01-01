package test;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Comp2 {
    public static void main(String[] args){
        String[] Colors = {"方块","梅花","红桃","黑桃"};
        String[] Values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        Map m = new HashMap();
//        Map m = Map.of("A",1,"2",2,"3",3,"4",4,"5",5,"6",6,"7",7,"8",8,"9",9,"10",10);
////        m.put("11",11,"12",12)
        int i=1;
        for(String k:Values){
            m.put(k,i++);
        }

        Map m2 = Map.of(1,2,1,2);
        Card c1 = new Card("红桃","4");//new 三张牌
        Card c2 = new Card("黑桃","4");
        Card c3 = new Card("红桃","K");
        System.out.println(Card.Compare(c1,c2));//c1<c2->44<46->true
        System.out.println(Card.Compare(c1,c3));//c1<c3->44<144->false
    }

}
