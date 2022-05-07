package listinterface;

import java.util.LinkedList;

public class addingsecondlisttofirst {
	public static void main(String args[] ) {

		LinkedList<String> ll=new LinkedList<String>();

		ll.add("Ravi");

		ll.add("Vijay");

		LinkedList<String> ll2=new LinkedList <String>();

		ll2.add("Sonoo");

		ll2.add("Hanumat");

		ll.addAll(ll2);

		System.out.println("After invoking addAll method: "+ll);

		}
}
