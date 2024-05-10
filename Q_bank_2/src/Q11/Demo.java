package Q11;

public class Demo {
	public static void main(String[] args) {
		//call show method in different ways
		show();//calling with class name
		Demo show= new Demo();//creating object
		show.show();//calling with object
		Demo.show();//calling with class name
	}
	public static void show(){
		System.out.println("show method");
	}
}
