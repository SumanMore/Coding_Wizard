package codingwizard;
import java.util.*;
public class p9q2 {
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("First String:");
	String s1=sc.nextLine();
	System.out.print("Second String:");
	String s2=sc.nextLine();
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	String s3="";
	for(int i=0;i<s2.length();i++)
	{
	char ch=s2.charAt(i);
	s3=Character.toString(ch);
	s1=s1.replace(s3,"");
	}
	
	System.out.println("Output:"+s1.trim());
}}

