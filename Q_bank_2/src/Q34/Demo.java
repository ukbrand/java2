package Q34;

import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		//take data id,name,salary from user using scanner and display that data in show method
		int id;
		String name;
		int salary;
//		System.out.println("enter your data");

		Scanner sc=new Scanner(System.in);
		System.out.println("enter your ID");
		id=sc.nextInt();
		System.out.println("enter your name");
		name=sc.next();
		System.out.println("enter your  salary");
		salary=sc.nextInt();
		Demo rc=new Demo();
		show(id,name,salary);
	
	}
	public static void show(int id,String name,int salary){
		//display data here by doing required changes
		System.out.println("enter your data");
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}

