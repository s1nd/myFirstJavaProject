package javaStudy11_re;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class findAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "bsdhsjAsdkcs(A);hhfy(g)eKgfuegr(B);jdcfieuH(ehdwi(C)";
		String pattern = "\\([A-Z]\\)";
		Pattern ans = Pattern.compile(pattern);
		Matcher m = ans.matcher(text);
//		System.out.println(m.find());
		/*
		if(m.find()) {
			System.out.println(m.group(0));
		}else {
			System.out.println("no matcher");
		}
		
		if(m.find()) {
			System.out.println(m.group(0));
		}else {
			System.out.println("no matcher");
		}
		*/
		while(m.find()) {
			System.out.println(m.group(0));
		}
		
	}

}
