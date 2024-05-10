package Q26;

import Employee1.emp;

public class Demo {
	public static void m1(int i){
		System.out.println(i);
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		emp kt=new emp();
		kt.id=101;
		kt.name="sam";
		kt.salary=1000;
		//call m1 method and pass employee id as parameter
		Demo.m1(kt.id);
	}
}
