package javaStudy00;

//enumerate
class Enumerate{
	enum People{meal, femeal, renyao};
	People gender;
}

public class obj{
	//sb 默认为null
	String sb;
	 obj(){
		System.out.print("hello ");
	}
//	 modified this.sb?
	void setSb(String rename){
		 sb = rename;
	 }
//  must add "void"
	void someBody(String name){
		 System.out.println(name);
	 }
	public static void main(String []args) {
		//System.out.println("hello");
		obj oo = new obj();
		oo.setSb("girl");
		oo.someBody(oo.sb);
		
//		enumber test
		Enumerate peo = new Enumerate();
		peo.gender = Enumerate.People.renyao;
		
		System.out.println(peo.gender);
		System.out.println(Byte.SIZE);
		System.out.println('\u0000');
		System.out.println(Float.MAX_VALUE);
		
		
		
	}
}

