package collectionsframework;

import java.util.ArrayList;

public class ArraylistDemo {
		public static void main(String[] args) {
			ArrayList<String>cities=new ArrayList<>();
			cities.add("London");
			cities.add("Denver");
			cities.add("London");
			cities.add("Paris");
			System.out.println("number of elements in the list="+cities.size());
		for(String t:cities){
			System.out.println(t);
			
		}
		}
}
		
			

