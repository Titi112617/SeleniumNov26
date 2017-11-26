package collectionsframework;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {

public static void main(String[]args){
	HashMap<String,Integer>teldirectory=new HashMap<>();
	teldirectory.put("Steve",7896545);
	teldirectory.put("paul",852356);
	for (Map.Entry M:teldirectory.entrySet()){
		System.out.println(M.getKey()+""+M.getValue());
		
		
	}
	
	
}
}
