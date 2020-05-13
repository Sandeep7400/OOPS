package com.pack;

public class SingleTonn {
	private static SingleTonn obj=null;
	
	static {
		obj=new SingleTonn();
	}
	private SingleTonn()
	{
		System.out.println("SingleTonn class");
	}
	
	public static SingleTonn getObject()
	{
		return obj;
	}
	
	public static void main(String[] args) {
		
		SingleTonn s1=SingleTonn.getObject();
		SingleTonn s2=SingleTonn.getObject();
		System.out.println(s1);
		System.out.println(s1);
	
		
	}
	

}
