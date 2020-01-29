
import java.util.*;


class sol{
	int count = 0;
	int pcount = 0;
	public String isDiv(int r) {
		int temp=0;
		int ptemp = 0;
		for (int i=1;i<=r/2;i++) {
			if (r%i==0) {
				temp++;
			}
		}
		count = temp+1;
		for  (int i=1;i<=count;i++) {
			if (count%i==0) {
				ptemp++;
			}
			
		}
		pcount = ptemp;
		return pcount==2?"prime":"not prime";
	}
}


public class bb {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
       
        sol obj = new sol();
        int arr[]=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
           
        }
        sc.close();
        for(int i=0;i<t;i++){
System.out.println(obj.isDiv(arr[i]));
           
        }
        
           
    }
    
}
