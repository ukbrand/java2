//package Q8;
//
//public class Demo {
//	public static void main(String[] args) {
//		Employee emp = new Employee(101, "sam", 1000);
//		Demo.show(emp);
//		System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());
//	}
//
//	public static void show(Employee ex) {
//		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
//		ex.setId(102);
//	}
//}

//output is 101,sam,1000::-reason is constructor is called and object member is putting the values 
//employee class use the setter and getter s 
//using getter method we can access the data as like line number 7
//then putting the passing the emp reference in show method 
//show method is called and this method access the deta using the parameters
// then first run the that statement is System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
// then change the id value using the set method 
//then cursor go to main function and print the next statement 
//executing the last line of the program and program is success fully run:

//final output is ::  101 sam 1000
//					  102 sam 1000
