package listinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test3 {

	public static void main(String[] args) {

		List<String> i=new ArrayList<String>();

		i.add("a");

		i.add("b");

		Iterator<String> z= i.iterator();

		while(z.hasNext())

		{

		System.out.println(z.next());

		}

		i.add("c");

		}
}