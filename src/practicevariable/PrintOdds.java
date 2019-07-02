package practicevariable;

public class PrintOdds {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,5,8,13,21,10};

		for (int even : num) {
			if(even % 2!=0) {
				System.out.println(even);
				//break;
				//continue;
			}
			//System.out.println("continue");
		}
	}
}
