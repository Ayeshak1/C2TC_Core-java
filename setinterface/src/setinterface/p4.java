package setinterface;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class p4 

{
	public static void main(String args[])
	{

	TreeSet<String> ts = new TreeSet<String>(Arrays.asList("red", "orange","blue", "green","white", "brown", "yellow", "black"));

	System.out.println(ts);
	
	Set<String>subSet = ts.subSet ("GREEN", "WHITE");

	System.out.println("sub set: "+subSet); subSet=ts.subSet ("green", "brown");

	System.out.println("sub set: "+subSet);
}
}
