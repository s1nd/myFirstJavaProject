package javaStudy06_array;

import  java.util.Arrays;
public class ArrayObj {
	public int[] el;
	public ArrayObj(int[] arr){

		el = new int[0];
//		el = new int[]{1,2,3};
	}

	//length
	private int size(){
	return el.length;
	}

	private void test(){
		System.out.println(Arrays.toString(el));
	}

	//增，将num添加在el[index]前
	private void add(int num, int index) {
		int sizeplus = el.length + 1;
		int[] newArry = new int[sizeplus];
//		if(el.length == 0){
//			newArry
//		}
//		虚拟一个el[el.length+1]元素

		if(index <sizeplus && index >= 0) {

//			新元素的新位置为index

			for(int i = 0, j = 0;i<sizeplus;i++,j++){
				if(i == index){
					newArry[i] = num;
					i++;
				}
				if(index != sizeplus-1){
				newArry[i] = el[j];
//				System.out.println(j);
				}
			}
			el = newArry;
		}else {
			System.out.println("index error!");
		}

	}

	//删
	public int del(int index) {

		int temp = el[index] ;
		int[] newArr = new int[el.length-1];
/*
		byte f= 0;
		for(int i=0;i<el.length-1;i++){
			if(i == index){
				f=1;
			}

			if (f == 0){
				newArr[i] = el[i];
			}else{
				newArr[i] = el[i+1];
			}
		}
*/
		for(int i=0;i<el.length-1;i++){
			if(i<index){
				newArr[i] = el[i];
			}else{
				newArr[i] = el[i+1];
			}
		}
		el = newArr;
		System.out.println(temp +" was deleted");
		return temp;
	}

	public static void main(String[] arg){
		ArrayObj newarr = new ArrayObj();
		int l = newarr.size();
//		System.out.println(l);
		newarr.add(1,0);
		newarr.add(2,0);
		int delval = newarr.del(0);
//		System.out.println(delval );
		newarr.test();
	}
}
