package javaStudy2;

public class calculuses {
//	computed y=x*x on the interval [1, 2]
	double y;
	double x;
	public calculuses() {
		
	}
	private double function(double x) {
		y = x * x;
		System.out.println("y is:"+y);
		return y;
	}
	private double divide(int n) {
		
		if( n > 1) {
			double delta = 1.0/n;
			System.out.println("delta is:"+delta);
			double arg = 1d;
			double s = 0d;
			for(int i = 0; i < n; i++) {
				s += function(arg)*delta;
				
				arg += delta;
				System.out.println("s is:"+s);
			}
			return s;
		}else{
			System.out.println("n is illegal");
			return -1.0;
		}
	}
	public static void main(String []args) {
		calculuses cal = new calculuses();
		double cals = cal.divide(100);
		System.out.println(cals);
	}
	
}
	