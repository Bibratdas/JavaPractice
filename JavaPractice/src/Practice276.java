
public class Practice276 {

	public static void main(String[] args) {

		reverseinteger();
		reverseString();
		reverseString1();
	}

	private static void reverseinteger() {
		int n =12345;
		int rev=0;
		while(n!=0) {
			rev=rev*10+(n%10);
			n=n/10;
		}
		System.out.print(rev);
		System.out.println();

	}
	

	protected static void reverseString() {
		
		String s="bibrat";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		
	}
	protected static void reverseString1() {
		
		String s="bibrat";
		
		char[] rev=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			
			System.out.print(rev[i]);
		}
		
		
	}


}
