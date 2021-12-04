
public class ReverseStringPractice {

	public static void main(String[] args) {
		
		String s="Bibrat";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);
		System.out.println(" ");
		System.out.println("------------------");
		StringBuilder Sb=new StringBuilder(s);
		System.out.println(Sb.reverse());
		System.out.println("------------------");
		StringBuffer Stb=new StringBuffer(s);
		System.out.println(Stb.reverse());
	}

}
