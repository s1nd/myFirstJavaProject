package test1;

import javaStudy06_array.Hash;

import java.util.*;

public class Comp {

    public static void main(String[] args){
        Card c1 = new Card("红桃","4");//new 三张牌
        Card c2 = new Card("黑桃","4");
        Card c3 = new Card("红桃","K");
//        Listof初始化的List不可排序
//        List l = List.of(c1,c2,c3);//java.util.ImmutableCollections$ListN
//        System.out.println(l.getClass());
        List l = new ArrayList();
        l.add(c1);
        l.add(c2);
        l.add(c3);

        Collections.sort(l);
        Card tem;
        for(Object c:l){
            tem = (Card)c;
            System.out.println(tem.value+":"+tem.color);
        }
//        System.out.println(l);
    }
}
class Card implements Comparable {
    static String[] Colors = {"方块","梅花","红桃","黑桃"};
    static String[] Values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    static Map m1 = new HashMap();
    static Map m2 = new HashMap();
    String color = null;
    String value = null;
    static {
        int i=10,j=1;
        for(String k:Values){
            m1.put(k,i+=20);
        }
        for(String k:Colors){
            m2.put(k,j++);
        }
    }
    Card(String c, String v){
        color = c;
        value = v;
    }
//compare方法是重写Comparator
//    @Override
//    public int compare(Object o, Object t1) {
//        Card c1 = (Card)o;
//        Card c2 = (Card)t1;
//        boolean b = (int)m1.get(c1.value)+(int)m2.get(c1.color)<(int) m1.get(c2.value)+(int)m2.get(c2.color);
//        if( b ){
//            return 1;
//        }else{
//            return -1;
//        }
//    }

    //CompareTo是重写Comparable接口
    @Override
    public int compareTo(Object obj){
        Card c1 = (Card)obj;
        boolean b = (int)m1.get(c1.value)+(int)m2.get(c1.color)<(int) m1.get(this.value)+(int)m2.get(this.color);
        if( b ){
            return 1;
        }else{
            return -1;
        }
    }

}
