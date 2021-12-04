import java.util.HashSet;
import java.util.Set;

public class DuplicateHastSet {

	public static void main(String[] args) {
		String[] Names= {"Java","Python","c","Java","Python"};
		
		Set<String> StoreHash=new HashSet<String>();
		for(String name:Names) {
			if(StoreHash.add(name)==false) {
				System.out.println(name);
			}
		}
	}

}
