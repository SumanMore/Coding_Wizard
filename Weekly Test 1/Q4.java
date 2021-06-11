//Add two integers without using the '+' operator

package codingwizard;
import java.util.*;


public class wtno4 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int q=sc.nextInt();
		add(p,q);
		
	}
	public static void add(int p,int q)
	{
		while(q!=0)
		{
		int c=p&q;
		p=p^q;
		q=c<<1;
		
		}
	System.out.println(p);}
	
}
