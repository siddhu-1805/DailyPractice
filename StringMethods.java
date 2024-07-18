package com.vasdoltechnologies;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Java";//literal
		
		String s1 = new String("Python");
		
		String s2 ="   javA  ";
		
		String s3 ="";
		
		System.out.println(s.length());//to find no of characters
		System.out.println(s.charAt(0));//give index specified value
		System.out.println(s.equals(s1));//content comparision
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.replace('J', 'p'));
		System.out.println(s.substring(0,2));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		char [] ch =s.toCharArray();
		System.out.println(Arrays.toString(ch));
		System.out.println(s.concat(s1));
		System.out.println(s.contains("java"));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());
		
		
	}

}
