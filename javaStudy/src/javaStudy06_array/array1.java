package javaStudy06_array;
import java.util.Arrays;
public class array1 {
	public static void main(String []args) {
		
//		String[] breakfast = {"egg", "fan", "bread"};
		
		int[] nums = {8,1, 2, 3};
		int[] num2 = new int[] {4,1,2,3};
		
		//equals有返回值
		Arrays.fill(num2,0, 1,2);
		Arrays.sort(num2);
		boolean res = Arrays.equals(nums,num2);
		System.out.println(res);
		System.out.println("hello");
		System.out.println(Arrays.toString(num2));
		
		
		/*
		String[] lunch = new String[3];
		lunch[1] = "meat";
		
		>>null
		System.out.println(lunch[0]);
		
		>>3
		System.out.println(lunch.length);
		for(String food:breakfast) {
			System.out.println(food);
		}
		*/
		
		
	}
}
