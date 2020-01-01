package test;

import java.util.Comparator;

public class Comp {
    public static void main(String[] args){
        Card c1 = new Card("红桃","4");//new 三张牌
        Card c2 = new Card("黑桃","4");
        Card c3 = new Card("红桃","K");
        System.out.println(Card.Compare(c1,c2));//c1<c2->44<46->true
        System.out.println(Card.Compare(c1,c3));//c1<c3->44<144->false
    }
}
class Card  {
    static String Colors = "方块梅花红桃黑桃";
    static String values = "345678910JQKA2";
    String color = null;
    String value = null;
    Card(String c, String v){
        color = c;
        value = v;
    }

    static boolean Compare(Card c1, Card c2){
        int valueC1ofCard = values.indexOf(c1.value)+3;//扑克牌值在values字符串中的位置，+3表示位置与值对应
        int valueC2ofCard = values.indexOf(c2.value)+3;
        int colorC1ofCard = Colors.indexOf(c1.color);//扑克牌花色在colors字符串中的位置
        int colorC2ofCard = Colors.indexOf(c2.color);
        int indexC1ofCard = Integer.valueOf(valueC1ofCard +""+colorC1ofCard);//拼接
        int indexC2ofCard = Integer.valueOf(valueC2ofCard +""+colorC2ofCard);
        System.out.println(indexC1ofCard);//调试,可删
        System.out.println(indexC2ofCard);//调试,可删
        if(indexC1ofCard<indexC2ofCard){
            return true;
        }else {
            return false;
        }
    }


}
