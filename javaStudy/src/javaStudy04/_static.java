package javaStudy04;

public class _static {
	public void a1(){
		System.out.println("1");
	}
	public void a2(){
		a1();
	}
	public static void main(String []args) {
		String a="1";
		System.out.println(a instanceof String);
//		System.out.println("");
	
	}
}
