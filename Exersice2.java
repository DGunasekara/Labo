import java.util.*;

public class Exersice2{

	   public static void main(String []args) {

	   	HashMap <String, String > hashMap = new HashMap<String , String>();

		   		for (String str:args){

			   		String[] comaSplit = str.split(",");

			   		hashMap.put(comaSplit[0],comaSplit[1]);				//enter the key and value to the hashma
			   	}
		   	
		System.out.println(Collections.singletonList(hashMap));
	}
}