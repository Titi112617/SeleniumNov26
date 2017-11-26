package Methodoverloading;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
public void add(int a,int b){
	System.out.println(a+b);
	
}
public void add(int a,int b, int c){
	System.out.println(a+b+c);
	
}
public static void main1(String[]args){
	Calculator basiccal=new Calculator();
	basiccal.add(20, 30);
	basiccal.add(10, 20,30);
}
}
