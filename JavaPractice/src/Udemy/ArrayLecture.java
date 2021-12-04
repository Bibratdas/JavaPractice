package Udemy;



public class ArrayLecture {

	public static void main(String args[]) {
		
		int[] arry1= {1,2,3,4,5,6};
		int[] arry2= new int[5];
		arry2[0]=1;
		arry2[1]=3;
		arry2[2]=4;
		arry2[3]=6;
		arry2[4]=7;
//		arry2[5]=8;
		
		
		for(int i=0;i<arry2.length;i++)
			if(arry2[i]%2==0)
				System.out.println(arry2[i] + " is even");
		
			else
				System.out.println(arry2[i] +" is odd number");
		
//		for(int i=0;i<arry1.length;i++)
		
	}

}
