package javaStudy09_Number;
//import java.lang.*;
public class Number {
	public Number() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x =Integer.valueOf("34")+2;
		int k =Integer.valueOf("34");
		Integer max = Math.max(k, x);
		Double y = Math.ceil(2.5);//双精度
		y = Math.floor(2.5);//双精度
		long z = Math.round(3.5);//返回long
		double ran = Math.random();//double
		System.out.println(max);
		System.out.println(ran);
		System.out.println(Math.sin(Math.PI/2));

		
	}

}
