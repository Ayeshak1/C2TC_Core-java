package setinterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class p2
  {

	public static void main(String args[])
	
	{

	SortedSet<String> sites = new TreeSet<>();

	sites.add("Technical"); sites.add("Technology");

	sites.add("quiz");

	sites.add("code");

	System.out.println("Sorted Set: " + sites);

	System.out.println("First: " + sites.first());
	
	
	System.out.println("Last:"+ sites.last());

	}

  }

