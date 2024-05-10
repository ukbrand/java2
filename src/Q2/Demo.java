package Q2;

 
import Employee1.Employee1;

public class Demo {
	   public static void main(String[] args) {
		//here create object of Employee class and add 101,sam,1000 data into that
		Employee1 emp=new Employee1();
		emp.id=101;
		emp.name="sam";
		emp.sallary=1000;
	    //display that data here
		
		System.out.println(emp.id);
		System.out.println(emp.sallary);
		System.out.println(emp.name);
	   }
	}
