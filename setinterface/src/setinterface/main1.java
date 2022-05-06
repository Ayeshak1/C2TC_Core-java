package setinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main1 {



				private static Set<String> vowelstist;

				public static void main(String[] args) {

				Set<String> vowels = new HashSet();

				vowels.add("a");

				vowels.add("e");

				vowels.add("i");

				List<String> vowelsList = new <ArrayList> (vowels);

				System.out.println("vowels set = "+vowels);
				System.out.println("vowelslist="+vowelsList);

				vowels.add("o"); vowelsList.add("a");

				vowelstist.add("u");

				System.out.println("vowels set="+vowels); 
				
				System.out.println("vowelslist="+vowelslist);

				vowels = new HashSet<> (vowelsList);

				System.out.println("vowels set = "+vowels);
	}

}
