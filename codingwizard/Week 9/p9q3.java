package codingwizard;
import java.util.*;
public class p9q3 {
public static void main(String args[])

{
	Scanner sc=new Scanner(System.in);

	int[] num = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] roman_sym = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    System.out.println("enter the number");
    int x=sc.nextInt();
    String res= "";  
          
    for (int i = 0; i < num.length; i++)
    {
       while (x >= num[i]) {
          res += roman_sym[i];
          x =x- num[i];
}}
    System.out.println(res);
}
}