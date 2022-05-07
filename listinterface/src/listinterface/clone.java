package listinterface;

import java.util.ArrayList;

public class clone {
	public static void main(String[] args)

	{

	ArrayList<String> al= new ArrayList<String>();

	Object cloneList;

	al.add("Java");

	al.add("C++");

	al.add("Count");

	System.out.println(al);

	cloneList= al.clone();

	System.out.println(cloneList);

	}
}
