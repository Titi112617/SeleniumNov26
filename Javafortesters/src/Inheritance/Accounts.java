package Inheritance;

public class Accounts extends Employee {
int bonus =8000;





public static void main(String[] args) {
	Accounts Ram = new Accounts();
	System.out.println("Total money received= $"+ (Ram.salary+Ram.bonus));
}
}
