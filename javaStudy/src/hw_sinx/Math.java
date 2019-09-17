package hw_sinx;

public class Math {
	Math(){
		
	}

	private double sinx(double x){
		double item =x;
		double result=x;
		for(int i=2;i<100;i++) {
			item *= (-1)*(x*x)/((2*i-2)*(2*i-1));
			System.out.println("item:"+item);
			result +=item;
		}
		return result;
	}
	public static void main(String []args) {
		Math s = new Math();
		double pi = 3.1415926;
		double p = s.sinx(pi/6);
		System.out.println(p);
	}
}
