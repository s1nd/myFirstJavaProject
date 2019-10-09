package hw_jiecheng;
import java.util.Arrays;
public class draft {
    public static void main(String []args){
//      2136 3423 2342 3424L
        long A = 2136342323423424L;
        String strA = "" + A ;
        int len = strA.length();
        int[] arrayA = new int[len];
        for(int i=0;i<len;i++){

            arrayA[i] = (int) strA.charAt(i)-48;
//            (int) '2' = 50;

            //乘数muti
            int muti = 120;
            arrayA[i] *= muti;
//            System.out.println(1);

        }
        //carry:进位
       String ans = "";

       for(int i=0;arrayA[0] == 0;i++){
//         采集末位的和
           int s = 0;
           int carry = 0;
           for(int j=len;j>len-i;j--){
               int endBit;
               endBit = arrayA[j]%10;
               s += endBit;
//             删除末位j
               arrayA[j] = (arrayA[j]-endBit)/10;
           }
           s += carry;
//         相同权位和的末位
           int sEnd = s%10;
//         carry进位
           carry = (s-sEnd)/10;
           System.out.println(1);
//         防止进位过大
           if(s<100){
               System.out.print(sEnd);
//             赋值一位
               ans += sEnd;

           }else{
               System.out.println("can not caculate");
           }
       }

        System.out.println(ans);


    }
}
