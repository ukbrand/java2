package Q23;

public class Demo {
	public static void m1(Object o){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		Object o=new Object();
		Demo.m1(o);
	}
}

