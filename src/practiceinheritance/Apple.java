package practiceinheritance;

public class Apple extends Fruit {
	@Override
	public void slice() {
		super.slice();
		System.out.println("slice from Apple");
	}

}
