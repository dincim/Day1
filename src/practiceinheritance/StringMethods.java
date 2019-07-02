package practiceinheritance;

public class StringMethods {

	public static void main(String[] args) {
		String str="You make me happy";
		String str1="You Make me happy";
		char s = str.charAt(0);
		System.out.println(s);
		System.out.println(str.length());
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf('m',str.indexOf("m")+1));
		System.out.println(str.indexOf("make"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(0, 8));
		
		String hi="  Hello World  ";
		System.out.println(hi.trim());
		System.out.println(hi.replace(" ", ""));
		
		String date="10.10.2010";
		System.out.println(date.replace("1", "10"));
		
		String car="Honda-Toyota-Bmw";
		String car1[]=car.split("-");
		System.out.println(car1[0]);
		
		for (int i = 0; i < car1.length; i++) {
			
			System.out.println(car1[i]);
		}
		String s1="zehra";
		System.out.println(s1.concat(" kusu bala kusu"));
	}

}
