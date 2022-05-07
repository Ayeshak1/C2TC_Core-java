package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class removemethod {
	public static void main(String args[])
 	{
Map<Character,String> map=new HashMap<Character,String>();
    		map.put('a',"Anil");
    		map.put('b',"Babu");
    		map.put('c',"Charan");
    		map.put('d',"Dharani"); 		
  		map.remove("Babu");         
             System.out.println(map);
  		 	}
}


