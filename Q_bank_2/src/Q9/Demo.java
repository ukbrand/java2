package Q9;

import Employee1.Employee1;

public class Demo {
	public static void main(String[] args) {
		//create Employee object with 101,sam,1000 data
		Employee1 Emp =new Employee1(); 
		Emp.id=101;
		Emp.name="sam";
		Emp.sallary=1000;
		//display this object data by passing to show method
		Demo.show(Emp);
		
		//add 100 bonus in salary 
		Emp.sallary=Emp.sallary+100;
		
		//display this object data by passing to show method
		 
		 Demo.show(Emp);
	}
	public static void show(Employee1 emp){
		//do required changes in show method
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.sallary);
		
	}
}
