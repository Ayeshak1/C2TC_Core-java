package listinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class test4 {
	public static void main(String[] args) {

		List<String> i=new ArrayList<String>();

		i.add("a");

		i.add("b");

		ListIterator<String> z= i.listIterator();

		while(z.hasNext())

		{

		System.out.print(z.next());

		z.previous();

		}
}
}
