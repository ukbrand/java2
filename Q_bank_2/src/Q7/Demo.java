package Q7;

import Employee1.Employee1;

public class Demo {
	public static void main(String[] args) {
		//here create two objects of Employee class and add  data into that
		
		Employee1 emp=new Employee1();
		emp.id=10;
		emp.name="umesh";
		emp.sallary=400;
		
		Employee1 emp1=new Employee1();
		
		emp1.id=20;
		emp1.name="shiv";
		emp1.sallary=500;
		
		//call show method and pass this two objects to show method
		
		Demo.show(emp,emp1);
	}
	public static void show(Employee1 emp,Employee1 emp1){
		//do required changes to show method and display that data here
		System.out.println("--------------fist Employee-----------");
		//first object is here display
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.sallary);
		
		//second object is here display
		System.out.println("--------------second Employee-----------");
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.sallary);
	}
}
