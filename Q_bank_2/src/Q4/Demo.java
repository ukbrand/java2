package Q4;

import Employee1.Employee;

public class Demo {
	
	 
	public static void main(String[] args) {
		//here create object of Employee class and add 101,sam,1000 data into that using constructor
		   Employee deta = new Employee(101,"dss",1000);
		   
		//display that data here
		
		   System.out.println(deta.id);
		   System.out.println(deta.name);
		   System.out.println(deta.sallary);
	   }
	}
