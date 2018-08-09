package com.moshi;

public class DemoGongchang2 {

	public static void main(String[] args) {

		new Factory_niutou().produce().info();
		new Factory_mamian().produce().info();
	}

}

interface ORC2{
	public void info();
}

class ORC_niutou2 implements ORC2{

	@Override
	public void info() {

		System.out.println("This is ORC_niutou");
	}
	
}
class ORC_mamian2 implements ORC2{
	
	@Override
	public void info() {
		
		System.out.println("This is ORC_mamian");
	}
	
}

interface factory2{
	public ORC2 produce();
}

class Factory_niutou implements factory2{

	@Override
	public ORC2 produce() {
		return new ORC_niutou2();
	}
}
class Factory_mamian implements factory2{
	
	@Override
	public ORC2 produce() {
		return new ORC_mamian2();
	}
}
