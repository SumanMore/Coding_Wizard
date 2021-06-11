package codingwizard;
import java.util.*;
public class wtno9 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
	
		System.out.println("enter the total no of elements");
		int n=sc.nextInt();
		ArrayList<Integer> ob=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
			ob.add(sc.nextInt());
		}
		Collections.sort(ob);
		System.out.println(ob.get(n-1)*ob.get(n-2)*ob.get(n-3));
		
		
	}

}
