
public class LargestandSmallest {

	public static void main(String[] args) {
		int[] numbers= {20,30,-19,40,40,90};
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
	}

}


