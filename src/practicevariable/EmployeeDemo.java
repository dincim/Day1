package practicevariable;

public class EmployeeDemo{
	String name;
	int age;
	
	static int compCode=2000;
	
	public int EmployeeSalary(){
		int salary=60000;
		int tax=8000;
		int netS=salary-tax;
		return netS;
	}

	public static void main(String[] args) {
		
		EmployeeDemo emp1=new EmployeeDemo();
		emp1.name="Murat";
		emp1.age=40;
		
		System.out.println("Emp name is "+emp1.name);
		System.out.println("Emp age is "+emp1.age);
		
		System.out.println("Company code is "+EmployeeDemo.compCode);
		
		System.out.println("Murat's salary is "+emp1.EmployeeSalary());
		
		EmployeeDemo emp2=new EmployeeDemo();
		
		String emp2name=emp2.name="Tuba";
		int emp2age=emp2.age=39;
		
		System.out.println("Emp2 name is "+emp2name);
		System.out.println("Emp2 age is "+emp2age);
		
		System.out.println(emp2name+"'s"+" compcode is "+emp2.compCode);
		
		System.out.println(emp2name+"'s salary is "+emp2.EmployeeSalary());
		
		
		
	}

}
