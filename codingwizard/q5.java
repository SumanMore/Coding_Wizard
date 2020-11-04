package codingwizard;

public class q5 {
	public static void main(String[] args) {
	 long m = 0;
	 for(int i = 999; i >=0; i--)
	{
	 for(int j = 999; j >= 0; j--)
	 {
	   long p = i * j;
       if(p == reverse(p) && p > m) 
	      m = p;
	   
     }
  }
	 System.out.println(m);
	 }
	public static long reverse(long n)
	{
		long reverse = 0;
	    while (n != 0) 
	    {
			long l= n % 10;
			reverse = reverse * 10 + l;
			n /= 10;
		 }
			       
	    return reverse;
			    
	}
			
}

