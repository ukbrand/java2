package Q24;

import Employee1.emp;

public class Demo {
	public static void m1(emp e){  
		//display data here
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
		
	}
	public static void main(String[] args) {
		//call m1 method from herep
		
		emp kt=new emp();
		Demo.m1(kt);
		
	}
}
