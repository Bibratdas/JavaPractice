package Udemy;


class animal {
	
	 void m1() {
	
	System.out.println("inside parent animal class");
}

}
class cat extends animal{
	void m1() {
		
		System.out.println("inside m1 cat class");
	}
	void m2 () {
		
		System.out.println("inside cat class");
	}
	
}
public class firstProgram {

	public static void main(String[] args) {
		
		animal a=new animal();
		cat c=new cat();
		animal ani=new cat();
//		cat ct=new animal();(not possible)
		
		
		
		
		
		
		
		
		
		a.m1();
		c.m2();
		c.m1();
		ani.m1();
		
	}

}
