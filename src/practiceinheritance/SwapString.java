package practiceinheritance;

public class SwapString {

	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		
		a=a+b;
		
		System.out.println(a);
		
		b=a.substring(0,5);
		System.out.println("b now is::"+b);
		a=a.substring(5,10);
		System.out.println("a now is::"+a);

	}

}
