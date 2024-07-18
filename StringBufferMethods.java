package com.vasdoltechnologies;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer("pythonDeveloper");
		sb.append("Java");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(2));
		sb.setCharAt(3, 'p');
		System.out.println(sb);
		System.out.println(sb.insert(4, "devleoper"));
		System.out.println(sb.delete(4, sb.length()));
		System.out.println(sb.deleteCharAt(3));
		System.out.println(sb.reverse());
		
		sb1.setLength(6);
		System.out.println(sb1);
		sb1.ensureCapacity(20);
		sb1.append("fullStack");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		
		System.out.println(sb1.lastIndexOf("p"));
		System.out.println(sb1.indexOf("e"));
		System.out.println(sb.equals(sb1));
		
	}

}
