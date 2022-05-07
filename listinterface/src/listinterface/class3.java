package listinterface;

import java.util.ArrayList;
import java.util.List;

public class class3 {
	public static void main(String [] args)
	{ 
       List<String> val1 = new ArrayList<>(); 
		val1.add("corona can be stopped");
     	List val2 = new ArrayList<>(); 
		val2.add("stay at home");
		val1.addAll(val2);
		System.out.println(val1);
	}
}


