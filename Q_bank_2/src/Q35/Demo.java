package Q35;

public class Demo {
	static int total = 0;//access any ware static variable

	public static void add() {  
		int total = 10 + 30;//only access within a method
	}

	public static void main(String[] args) {
		Demo.add();
		System.out.println(total);
	}
}

//reason is static variable access any ware
//add method variable is not access to outware the add method 