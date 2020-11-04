package codingwizard;

public class q3
{
	public static void main(String args[])
	{
	 int c,i;
	 long n,length=0,res=0;
	for ( i = 2; i <=1000000; i++) 
	{
	     c = 1;
	     n=i;
	    while (n != 1) 
	    {
	        if ((n% 2) == 0)
	           n = n / 2;
	        else 
	            n = n * 3 + 1;
	        c++;
	    }
	   if (c > length) {
	        length = c;
	        res = i;
	    }
	}
System.out.println(res);
}}