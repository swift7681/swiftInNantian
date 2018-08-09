package com.moshi;

public class DemoGongchang {

	public static void main(String[] args) {

		new Factory("niutou").getORC().info();;
	}

}

interface ORC{
	public void info();
}

class ORC_niutou implements ORC{

	@Override
	public void info() {

		System.out.println("This is ORC_niutou");
	}
	
}
class ORC_mamian implements ORC{
	
	@Override
	public void info() {
		
		System.out.println("This is ORC_mamian");
	}
	
}
class Factory{
	
	private String type;
	public Factory(String type){
		this.type=type;
	}
	public ORC getORC(){
		if(this.type.equals("niutou")){
			return new ORC_niutou();
			
		}else if(this.type.equals("mamian")){
			return new ORC_mamian();
		}
		return null;
		
	}
}