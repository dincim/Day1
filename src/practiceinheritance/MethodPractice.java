package practiceinheritance;

public class MethodPractice {

	public static void main(String[] args) {
		MethodPractice obj=new MethodPractice();
		//obj.sum();
		int d=obj.sum();
		System.out.println(d);

	}
	
	public int sum() {
		System.out.println("Sum Method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}

}
