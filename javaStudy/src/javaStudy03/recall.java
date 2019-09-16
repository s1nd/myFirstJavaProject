package javaStudy03;

//所有的实例对象操作同一个静态变量/类变量
public class recall {
	static byte var = 1;
	
	public recall() {
		System.out.println(var);
	}
	public static void hello() {
		var =2;
		System.out.println(var);
	}
	
	public static void hello2() {
		var=3;
//		for(int i=0;i<2;i++)hello();
		System.out.println(var);
	
	}
	
	public static void main(String []args) {
//		hello2();
		recall girl1 = new recall();
		
		girl1.hello();
		girl1.hello2();
		recall girl2 = new recall();
		
	}
}
