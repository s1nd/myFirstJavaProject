package javaStudy11_re;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class regularExpression {
	public static void main(String []args) {
		String sentence = "abc123...321xyz";
		String pattern = "([a-zA-Z]*)(\\d+)(.*)";
		
		//检测是否匹配
		boolean isMatcher = Pattern.matches(pattern,sentence);
		System.out.println(isMatcher);
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(sentence);
		
		//matcher many times
		String multMatch = "\\d+";
		Pattern p1 = Pattern.compile(multMatch);
		Matcher m1 = p1.matcher(sentence);
		
		//Matcher.group(0) return whole string
		/*
		if(m.find()) {
			System.out.println(m.group(0));
			System.out.println(m.group(1));
			System.out.println(m.group(2));
			System.out.println(m.group(3));
		}else {
			System.out.println("no match");
		}
		*/
		if(m1.find()) {
			System.out.println(m1.start());
			System.out.println(m1.end());
		}else {
			System.out.println("no matcher");
		}
		if(m1.find()) {
			System.out.println(m1.start());
			System.out.println(m1.end());
		}else {
			System.out.println("no matcher");
		}
	}
}
