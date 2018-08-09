class First{
	public First(){
		aMethod();
	}
	public void aMethod(){
		System.out.println("in First class");
	}
}
public class Second extends First{
	public void aMethod(){
		System.out.println("in Second class");
	}
	public Second(){
		super();
	}
	public static void main(String[] args) {
		new First();
	}
}
