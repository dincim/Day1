package practicevariable;

public class StringBuffer {
	

	public static void main(String[] args) {
		String st1="abc";
		st1=st1+"d";

//		StringBuilder stb=new StringBuilder(st1);
//		stb.append("d");
//		stb.append("efg");
		//print stb --> abcd
		String st="Hello";
		st+=" World";

		StringBuilder stb=new StringBuilder("Hello");
		stb.append("World");
		stb.reverse();

		System.out.println(st);
		System.out.println(stb);


	}

}
