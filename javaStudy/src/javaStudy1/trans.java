package javaStudy1;
import javaStudy1.*;
public class trans{
	private void change(){
		
//		forced type convertion
		str += 1;
	}
	
	public String str = "no.";
	private static String str2 = "hello";
	public static void main(String []args){
		import_test2 im = new import_test2();
		im.testFunc();
		trans c = new trans();
		c.change();
		System.out.println(c.str);
		
//		type inspect
		System.out.println(str2 instanceof String);
		
		//stronger "for"
		String [] dom107 = {"dbd", "hyf", "sy", "xm"};
		for(String stu: dom107) {
			System.out.println(stu);
		}
	}
}

