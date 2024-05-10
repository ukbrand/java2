package Q33;

import Employee1.emp;

public class Demo {
	public static void show(emp kt){
		
		System.out.println(kt.id);
		System.out.println(kt.name);
		System.out.println(kt.salary);
	}
	public static void process(emp kt){
		kt.id=12;
		kt.name="umesh";
		kt.salary=1000;
		
	}
	public static void main(String[] args) {
		//do required changes in main,process and show method
		//create empty employee object here
		emp rc=new emp();
		
		//add data into that empty object using process method
		Demo.process(rc);
		//display employee object with data in show method
		Demo.show(rc);
	}
}

