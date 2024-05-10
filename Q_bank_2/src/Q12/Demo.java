package Q12;

public class Demo {
	private static int total = 10;
	public static void main(String[] args) {
		//print total in different ways
		
		System.out.println(total);//direct access
		System.out.println(Demo.total);//class name access 
		Demo total=new Demo();
		System.out.println(total.total);//with object access
	}
}
