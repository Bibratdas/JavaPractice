
public class ReverseString {

	public static void main(String[] args) {
		String s="Abcde";
		char[] abc=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(abc[i]);
		}
	}

}
