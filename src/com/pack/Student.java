package com.pack;

public class Student {
	
public static void main(String[] args) {
		
		String s1="Sandeep";
		String s2="Sandeep";
		String s3=new String("Sandeep");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		/*StringBuffer sb1=new StringBuffer("Kumar");
		StringBuffer sb2=new StringBuffer("Kumar");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(s1.substring(3,6));
		System.out.println(s1.replace('a','c'));
		System.out.println(s1.indexOf('e'));*/
		
		String s4="kumar";
		String s6=new String("kumar");
		String s5="kumar";
		System.out.println(s4==s6);
		System.out.println(s4==s5);
		System.out.println(s4.equals(s6));
		System.out.println(s6.equals(s5));
		
	}}



