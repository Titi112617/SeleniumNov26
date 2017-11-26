package Inheritance;

public class HR extends Employee {
int bonus =12000;







public static void main(String[] args) {
	HR Ram = new HR();
	System.out.println("Total money received= $"+ (Ram.salary+Ram.bonus));
}
}
