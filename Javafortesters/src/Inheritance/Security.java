package Inheritance;

public class Security extends Employee  {
       int bonus =5000;
       
       
       
       
       
       public static void main(String[] args) {
   		Security Ram = new Security();
   		System.out.println("Total money received= $"+ (Ram.salary+Ram.bonus));
   	}

}
