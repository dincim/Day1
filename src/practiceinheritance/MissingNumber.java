package practiceinheritance;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[] = { 1,2,3,4,5,6,7,8,10,11,12,13};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum = sum +a[i];

		}
		System.out.println(sum);
		
		int sum1=0;
		for (int i = 1; i <= 13; i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1-sum);
	}

}
