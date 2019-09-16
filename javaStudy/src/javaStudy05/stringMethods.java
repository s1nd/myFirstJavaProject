package javaStudy05;

public class stringMethods {
	public static void main(String []args) {
		/*
		String str = "hello";
		
		int len = str.length();
		System.out.println(len);
		
		int opsition = str.indexOf(2);
		System.out.println(opsition);
		
		int sop = str.indexOf("ll"); 
		System.out.println(sop);
		
		char character = str.charAt(2);
		System.out.println(character);
		*/
		
		//?????????????????????copyValue
//		char[] world = {'w','o','r','l','d'};
//		String str2 = "aa";
//		String str3 = "bb";
//	    str2 = str.copyValueOf(world);
//	    str3 = str.copyValueOf(world, 0, 2);
//	    
//	    System.out.println(str2);
//	    System.out.println(str3);
		
		//getChars(int begin, int end, char[] string, pianyi)  [begin, end)
		/*
		String hello = "good morning";
		dststr must initialization;
		char []dststr = new char[6];
		
		what is  the "1" mean?
		hello.getChars(2,6,dststr,1);
		System.out.println(dststr);
		*/
		
//		StringBuffer coffee = "hhhhhhhhhellllllllo";
		StringBuffer coffe = new StringBuffer("heelo");
		
//		delete[begin, end)
		coffe.delete(0, 2);
		System.out.println(coffe);
		
		coffe.replace(0, 2, "hello");
		System.out.println(coffe);
		
		coffe.insert(1, 3);
		System.out.println(coffe);
	}	
}
	
