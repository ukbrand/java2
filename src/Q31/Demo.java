package Q31;

import Employee1.emp;

public class Demo {
	public static emp m1(){
		//create Employee object here and return
		emp rc=new emp();
		return rc;
		//don’t change m1 method prototype i.e return type or access specifier
	}
	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		emp rc=Demo.m1();
		//display returned employee data here
		System.out.println(rc.id);
		System.out.println(rc.name);
		System.out.println(rc.salary);
	}
}

