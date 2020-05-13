package com.pack;

class Test2
{

	private static Test2 obj=null;
	
	static 
	{
		obj=new Test2();
	}
	private Test2()
	{
		System.out.println("Singleton design pattern");
	}
	
	public static Test2 getObject()
	{
		return obj;
	}}

public class SingleTon {
	public static void main(String[] args) {
		
		Test2 t1=Test2.getObject();
		Test2 t2=Test2.getObject();
		System.out.println(t1);
		System.out.println(t2);
	}
		
	}



	

	
	

