import java.util.*;
 class mException extends Exception {
	public mException(String s) {
	  super(s);
	}
}
public class CCprob {
public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no.of Elements: ");
	
	int n = sc.nextInt();
	System.out.println("Enter elements  : ");
	int t[] = new int[n];
	for (int i=0;i<n;i++) {
		t[i] = sc.nextInt();
	}
	System.out.println("Enter k :");
	int k ;
	try {
		k = sc.nextInt();
		if (1<=k && k>=n) {
			throw new mException("k must be less than length of array");
		}
		for (int i = 0;i<n;i++) {
			for (int j = i;j<n;j++) {
				int temp=0;
				if (t[i] < t[j]) {
					temp = t[i];
				   t[i] = t[j];
				   t[j] = temp;
				}
			}
		}
		System.out.println(t[k-1]);
	}
	catch(Exception e) {
		System.out.println(e);
	}
   finally {
	   sc.close();
   }
	

	

	
}
}
