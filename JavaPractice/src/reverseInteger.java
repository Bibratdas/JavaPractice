
public class reverseInteger {

	public static void main(String[] args) {
		int a=123456;
		
		int rev=0;
		int reminder;
		while(a!=0) {
			
			reminder=a%10;
			rev=rev*10+reminder;
			a=a/10;
			
		}
		System.out.println(rev);
	}

}
