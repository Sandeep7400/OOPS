package com.pack;
class Parent
{
	public void methodOne()
	{
		System.out.println("Parent class");
	}
}
class Child extends Parent
{
	public void methodOne()
	{
		System.out.println("Child class");
	}
}

public class Test {
	
	public static void main(String[] args) {
		Parent p=new Parent();
		p.methodOne();
		Child c=new Child();
		c.methodOne();
		Parent p1=new Child();
		p1.methodOne();
	}

}
