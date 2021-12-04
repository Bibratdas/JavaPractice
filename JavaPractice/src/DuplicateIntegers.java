import java.util.HashSet;
import java.util.Set;

public class DuplicateIntegers {

	public static void main(String[] args) {
		int[] value= {1,2,3,4,1,3};
		
		Set<Integer> intvalue=new HashSet<Integer>();
		
		for(int newvalue:value) {
			
			if(intvalue.add(newvalue)==false) {
				System.out.println(newvalue);
			}
		}

	}

}
