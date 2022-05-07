package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class entryset {
	public static void main(String args[])
 	{  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  		map.put(96,"Tanay");  
  		map.put(80,"Aditya");  
  		map.put(100,"Neha");  
  		for(Map.Entry m:map.entrySet())
  		{  
   			System.out.println(m.getKey()+" "+m.getValue());  
  		}  
 	}  

}
