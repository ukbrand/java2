package Q3;

import Employee1.Employee2;

public class Demo {
	   public static void main(String[] args) {
		//here create object of Employee class and add 101,sam,1000 data into that using setter method
		   Employee2 emp1=new Employee2();
		   
		   emp1.SetId(12);
		   emp1.SetName("umesh");
		   emp1.SetSallary(10000);
		//display that data here
		    
		   System.out.println(emp1.getId());
		   System.out.println(emp1.getName());
		   System.out.println(emp1.getSallary());
	   }
	}
