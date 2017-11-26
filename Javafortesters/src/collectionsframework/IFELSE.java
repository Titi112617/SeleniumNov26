package collectionsframework;

import java.util.Scanner;

public class IFELSE {
	public static void main(String[] args) {
		System.out.println("please write the color");
		@SuppressWarnings("resource")
		Scanner K=new Scanner (System.in);
		String color=K.nextLine();
		if(color.equals("Yellow")){
			System.out.println("Today it is sunny outside");
		}
		else if (color.equals("Black")){
			System.out.println("Today it is cloudy");
		}
		else{
			System.out.println("Weather can not be predicted");
			
		}
		
		
	}

}
