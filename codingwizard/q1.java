package codingwizard;

import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       String str="";char ch;
       int i;
 for (i=0;i<s.length();i++)
   { 
	 ch=s.charAt(i);
        if ( ch != 'G'&& ch!='C'&& ch!='T'&&ch!='A')
        {
				System.out.println("Invalid Input");
				System.exit(0);
			}
			else
			{
				if(ch == 'G')
					str+='C';
				else if(ch == 'C')
					str+='G';
				else if(ch == 'T')
					str+='A';
				else if(ch == 'A')
					str+='U';
			}
		}
		System.out.println(str);
	}

}