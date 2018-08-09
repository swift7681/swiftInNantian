package com.moshi;

public class Demo_Zhuangshizhe {

	public static void main(String[] args) {

		new ProxyCompanyTaozhai().taozhai();
	}

}

interface taozhai{
	
	public void taozhai();
}
class MyTaozhai implements taozhai{

	@Override
	public void taozhai() {

		System.out.println("把钱还给我...");
	}
	
}

class ProxyCompanyTaozhai implements taozhai{
	
	private MyTaozhai taozhai=new MyTaozhai();

	@Override
	public void taozhai() {

		System.out.println("威胁 恐吓 暴打 砸窗 踹门");
		taozhai.taozhai();
		System.out.println("讨债成功，讨债公司收分红");
	}
	
}