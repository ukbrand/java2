package Q21;

import Employee1.emp;

public class Demo {
	public static void m1(emp e){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		emp kt= new emp();
		Demo.m1(kt);
	}
}
