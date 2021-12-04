package RahulShettyLectures;

public class Lecture3 {

	public static void main(String[] args) {
		
//		String a="hello";
//		String b="hello";
//		
//		System.out.println(a.charAt(0));
//		System.out.println(b.indexOf("l"));
//		System.out.println(a.substring(0, 3));
//		
		
		String test="I am good 'a' Boy";
//		Expected yoB 'a' good ma I
		
		String[] abc=test.split(" ");
		String Revam="";
		String revboy="";
		
		String a=abc[0];
		for(int i=abc[1].length()-1;i>=0;i--) {
			 Revam += abc[1].charAt(i);
		}
		for(int j=abc[4].length()-1;j>=0;j--) {
			revboy+=abc[4].charAt(j);
			
		}
		
		System.out.print(revboy+" "+abc[3]+" "+abc[2]+" "+Revam+" "+a);
		
		

	}

}
