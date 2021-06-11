package codingwizard;
import java.util.*;
public class wt2qno5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s="";int s1=0;
		str=str+" ";
		for(int i=0;i<str.length();i++)
		{
			s="";
			if(str.charAt(i)==' '||str.charAt(i)=='.')
			{
				
				for(int j=i-1;j>=s1;j--)
				{
					s=s+str.charAt(j);
				}
				s=s+" ";
				s1=i;
				
				
			}
			System.out.print(s);
			
		}
		
		
	}

}
