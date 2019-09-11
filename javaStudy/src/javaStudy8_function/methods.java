package javaStudy8_function;
 class sum{
//	 overload
	 public sum(){
		 
	 }
	public int sum1(int a,int b){
		return a+b;
	}
	public int sum1(int a,int b,int c){
		return a+b+c;
	}
}

public class methods {
	public static void main(String[] args) {
//		for(byte i =0;i<args.length;i++) {
//			System.out.println(args[i]);
//			
//		}
//		System.out.println(args.length);
		sum s =new sum();
		System.out.println(s.sum1(2,1));
		System.out.println(s.sum1(2,1,3));
		
		
		
	}
}
