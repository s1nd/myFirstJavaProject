package javaStudy10_Scanner;
//import java.util.Scanner;
import java.util.*;
public class scanner {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		if(scanner.hasNextInt()) {
			int st = scanner.nextInt();
			System.out.println(st);	
			scanner.close();
		}
//		nextLine 会读取回车键之前所有字符，而next遇到空白就停止
//		String str = scanner.nextLine();
//		System.out.println(str);	
		//remove warnning
		scanner.close();
		//判断输入是否为整数
//		if(scanner.hasNextInt()) {
//		i = scanner.nextInt();
//		System.out.println(i);
//		scanner.close();
//		}
	
		
		//nice code
		/*
		Scanner scanner = null;
		try {
		    scanner = new Scanner(System.in);
		    if(scanner.hasNextInt()) {
			    i = scanner.nextInt();
				System.out.println(i);
		    }
		}
		finally {
		    if(scanner!=null)
		        scanner.close();
		}
		*/
		

	}
}
