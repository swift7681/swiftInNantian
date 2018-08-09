package com.moshi;

public class TestSingleton2 {

	public static void main(String[] args) {

		Singleton_lazy2.getSingleton().fun();
		Singleton_hungry2.getSingleton().fun();
	}

}

class Singleton_hungry2{
	
	private static Singleton_hungry2 singleton=new Singleton_hungry2();
	private String name="god";
	private int age=10000;
	
	private Singleton_hungry2(){}
	
	public void fun(){
		System.out.println("this is singleton_hungry "+name+" and he's age is  "+age);
	}
	
	public static Singleton_hungry2 getSingleton(){
		return singleton;
		
	}
}

class Singleton_lazy2{
	
	private static Singleton_lazy2 singleton=null;
	private String name="god";
	private int age=10000;
	
	private Singleton_lazy2(){}
	
	public void fun(){
		System.out.println("this is Singleton_lazy2 "+name+" and he's age is  "+age);
	}
	public static Singleton_lazy2 getSingleton(){
		synchronized(Singleton_lazy2.class){
			
			if(singleton==null){
				singleton=new Singleton_lazy2();
				return singleton;
			}else{
				
				return singleton;
			}
		}
	}
}
