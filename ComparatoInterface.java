import java.util.*;

public class ComparrInterface {
 public static void main(String args[]) {
	 List<Integer> l = new ArrayList<>();
	 l.add(243);
	 l.add(678);
	 l.add(222);
	 l.add(2, 797);
	 
	
	 
	 Collections.sort(l, ( i, j) ->  i%10>j%10?1:-1;));
	 for (Integer i : l) {
		 System.out.println(i);
	 }
	 
 }
}
