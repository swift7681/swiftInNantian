package com.moshi;

public class TestSingleton {

	public static void main(String[] args) {

		Singleton_hungry.getSingleton().fun();
		Singleton_lazy.getSingleton().fun();
	}
}

class Singleton_lazy {

	private String name="God";
	private int age=100000;
	private static Singleton_lazy singleton=null;
	
	private Singleton_lazy(){};
	
	public static synchronized Singleton_lazy  getSingleton(){
		if(singleton==null)
			singleton=new Singleton_lazy();
		return singleton;
	}
	
	public void fun(){
		System.out.println("This is 懒汉式,and the sigleton is "+name+" 年龄是"+age);
	}
}
class Singleton_hungry {
	
	private String name="God";
	private int age=100000;
	private static Singleton_hungry singleton=new Singleton_hungry();
	
	private Singleton_hungry(){};
	
	public static Singleton_hungry getSingleton(){
		return singleton;
	}
	
	public void fun(){
		System.out.println("This is 饥汉式,and the sigleton is "+name+" 年龄是"+age);
	}
}
