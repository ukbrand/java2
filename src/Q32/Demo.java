package Q32;

public class Demo {
	public static int m1(int i){
		System.out.println("m1 is called"+"with"+i);
		
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method from here in different ways
		m1(23);//direct calling 
		Demo.m1(32);//with class calling 
		Demo rc= new Demo();//creating the object
		rc.m1(43);//with object calling 
	}
}

