package Demo;

public class Calculator {
     
	public void Add(int a,int b){
		System.out.println(a+b);
	}
	public void subtract(int a, int b){
		System.out.println(a-b);
	}
	public void Multiply(int a, int b){
		System.out.println(a*b);
	}
	//Adding a comment in line number 13
	public void Divided(int a, int b){
		System.out.println(a/b);
		
			}
		public static void main(String[] args){
		// TODO Auto-generated method stub
     Calculator basicCal=new Calculator();
     basicCal.Add(5,6);
     basicCal.subtract(10,6);
     basicCal.Multiply(19,7);
     basicCal.Divided(100,10);
		}
     
     
     
     
     
	}
  
