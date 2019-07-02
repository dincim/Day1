package practiceinheritance;

import java.util.Arrays;

public class SmallestAndLargestNum {

	public static void main(String[] args) {
		int num[]= {-30,-20,10,30,50,60,80};
		
		int largest=num[0];
		int smallest=num[0];
		
		for (int i = 1; i < num.length; i++) {
			if(num[i]>largest) {
				largest=num[i];
			
		}else if(num[i]<largest) {
			smallest=num[i];
	}
		}
		System.out.println("given array is::"+Arrays.toString(num));
		System.out.println("Largest num is::"+largest);
		System.out.println("Smallest num is::"+smallest);
	}
}
