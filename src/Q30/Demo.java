package Q30;

import Employee1.emp;

public class Demo {
	public static emp m1(){
		//create Employee object here and return
		emp x=new emp();		 
		return x;
		//do required changes in m1 method to do this task
	}


	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		emp a=Demo.m1();
		//display returned employee data here
		System.out.println(a.id);
		System.out.println(a.name);
		System.out.println(a.salary);
	}
}

