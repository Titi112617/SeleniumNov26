package collectionsframework;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println("please enter todays day=");
		@SuppressWarnings("resource")
		Scanner K=new Scanner (System.in);
		String day=K.nextLine();
		switch(day){
		case "Monday":
		System.out.println("Today I will wear pink");
		case "Tuesday":
		System.out.println("Today I will wear white");
		case "Saturday":
		System.out.println("Today I will wear orange");
		
		}
	}
}		
				
		
		
		

