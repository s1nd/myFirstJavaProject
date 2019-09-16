package javaStudy07_date;
import java.util.Date;
import java.util.*;
public class dateObj {
	public static void main(String[] args) {
		Date time = new Date();
		Date time1 = new Date(24*3600*1000);
		long sec = time.getTime();
		System.out.println(time.toString());
		System.out.printf("%tc%n",time);

		
		try {
			Thread.sleep(1000*3);
		}catch(Exception e){
			
		}
		
		System.out.println(time1.toString());
		System.out.println(sec);
	}
}
