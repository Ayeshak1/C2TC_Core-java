package listinterface;

import java.util.ArrayList;
import java.util.Collections;

public class class8 {
	public static void main(String a[])

	{

	ArrayList<String> list = new ArrayList<String>();

	list.add("C");

	list.add("Python");

	list.add(".net");

	list.add("Compiler");

	Collections.shuffle(list);

	System.out.println("Results after shuffle operation:"+ list);

	Collections.shuffle(list);

	System.out.println("Results after shuffle operation:");
	}
}
