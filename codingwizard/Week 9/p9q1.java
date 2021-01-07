package codingwizard;
import java.util.*;
public class p9q1 {
public static void main(String args[])
{
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of elements in an array");
    int n=sc.nextInt();
    int arr[]=new int[n];
     System.out.println("Enter the elements");
     for (int i = 0; i < n; i++)
         arr[i] = sc.nextInt();
     System.out.println("Enter sum");
     int sum = sc.nextInt();
	for(int i=0;i<n-2;i++)
    {
        for(int j=i+1;j<n-1;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if((arr[i]+arr[j]+arr[k]) == sum)
                {
                    System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    System.out.println("There is a triplet("+arr[i]+" "+arr[j]+" "+arr[k]+") present in array whose sum is "+sum);
              }
        }
    }}}}
