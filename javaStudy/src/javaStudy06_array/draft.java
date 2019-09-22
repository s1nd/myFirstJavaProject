package javaStudy06_array;
import java.util.Arrays;
public class draft {
	public static void main(String[] args) {
		//**必须new 才能赋值
		int[] arr = new int[3];
		arr[0] = 1;
//		arr[1] = 1;
		arr[2] = 3;
//		越界，Exception in thread "main"
		System.out.println(arr[4]);
//		System.out.println(Arrays.toString(arr));
		
	}
}
