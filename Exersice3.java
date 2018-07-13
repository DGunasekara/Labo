import java.util.*;

public class Exersice3{

	   public static void main(String []args) {


	   	HashMap <String, ArrayList <String>> hashMap = new HashMap<String , ArrayList <String>>();


	   	


		   		for (String str:args){

			   		String[] comaSplit = str.split(",");   				//splitting the space separated array by comas

					ArrayList <String> list = new ArrayList <String>();   //make an array list to store the arguements

			   		for (int i = 1;i<comaSplit.length ;i++ ){

			   			list.add(comaSplit[i]);							//store the values in the array list

			   		}
			   		hashMap.put(comaSplit[0],list);						//enter the kes and values to the hashmap
			   	}

		System.out.println(Collections.singletonList(hashMap));
	}
}