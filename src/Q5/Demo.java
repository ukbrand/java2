package Q5;

import Employee1.Employee1;

public class Demo {
	  public static void main(String[] args) {
	            //here create object of Employee class and add 101,sam,1000 data into that
		  Employee1 Emp=new Employee1();
		  Emp.id=12;
		  Emp.name="sam";
		  Emp.sallary=1000;
		  		
		        //call show method and pass this created object to show method
		  Demo.show(Emp);

		}
		public static void show(Employee1 emp){
			//do required changes to show method and display that data here
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.sallary);
		}
	}

