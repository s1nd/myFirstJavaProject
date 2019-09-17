package hw_数啤酒瓶;

public class junle {
	private static void single(byte n) {
		String count = n==1?"No more":n-1+"";
		String s1 = n==2? " bottle": " bottles";
		String s2 = n==1? " bottle": " bottles";		
		System.out.print(n +s2+ " of beer on the wall, ");
		System.out.println(n +s2 +" of beer");
		System.out.println("Take ome down");
		System.out.println("Pass it around");
		System.out.println(count + s1+ " of beer on the wall");
		System.out.println();
	}
	public static void main(String[] args) {
		for(byte i=99;i>0;i--) {
			single(i);
		}
	}

}
