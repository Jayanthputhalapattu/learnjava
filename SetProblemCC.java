import java.util.*;
public class ProblemHack {
    public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
       System.out.println("Enter no.of elements  :");
       int n = sc.nextInt();
       System.out.println("Enter k : ");
       int k= sc.nextInt();
       int t[] = new int[n];
    Set<Integer> s = new HashSet<>();
     
       for (int i=0;i<n;i++) {
    	    t[i]=sc.nextInt();
       }
       sc.close();
       for (int i :t) {
    	   s.add(i);
       }
    Iterator<Integer> it = s.iterator();
      int index=0;
      while(it.hasNext()) {
    	
    		 t[index]=it.next();
    		 index+=1;
    	 }
   System.out.println(t[s.size()-k]);
    }
} 
