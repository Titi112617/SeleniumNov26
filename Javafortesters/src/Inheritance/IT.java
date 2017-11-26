package Inheritance;

public class IT extends Employee  {
	int bonus=10000; 
	
	
	
	
	
	
	public static void main(String[] args) {
		IT Ram = new IT();
		System.out.println("Total money received= $"+ (Ram.salary+Ram.bonus));
	}
}

	
