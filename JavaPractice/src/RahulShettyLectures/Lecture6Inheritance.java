package RahulShettyLectures;


 class ParentClass {
	
	void parentMethod() {
		
		int i=10;
		System.out.println(i);
	}
}
 class childClass extends ParentClass  {
	
	void childMethod() {
		
		int i=20;
		System.out.println(i);
	}
}

public class Lecture6Inheritance {

	public static void main(String[] args) {
		
		ParentClass p=new childClass();
		childClass c=new childClass();
		p.parentMethod();
		c.parentMethod();
		c.childMethod();
		
	
	}

}
