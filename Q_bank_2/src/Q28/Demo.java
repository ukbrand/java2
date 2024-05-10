package Q28;

public class Demo {
	public static int m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		int result=Demo.m1(2);
		int total = 100 + result;
		System.out.println(total);
	}
}
