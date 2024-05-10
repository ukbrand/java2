package Q25;

import Employee1.emp;

public class Demo {
	public static void m1(emp o){
		//display employee data here
		
		System.out.println(o.id);
		System.out.println(o.name);
		System.out.println(o.salary);
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		emp kt=new emp();
		kt.id=101;
		kt.name="sam";
		kt.salary=1000;
		
		//call m1 method by passing this Employee object
		
		Demo.m1(kt);
	}
}
