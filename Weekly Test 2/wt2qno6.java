package codingwizard;
import java.util.*;
public class wt2qno6 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	str=str.toLowerCase();
	for(char ch='a';ch <='z';ch++)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				c++;
		}
		if(c>0)
		     System.out.println("the number of occurrences of "+ ch+" is "+c);
	}
	
}

}
