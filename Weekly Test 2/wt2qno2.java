package codingwizard;
import java.util.*;
public class wt2qno2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of first array");
		int N1=sc.nextInt();
		System.out.println("Enter the size of second array");
		int N2=sc.nextInt();
		ArrayList<Integer> A=new ArrayList<Integer>(N1);
		ArrayList<Integer> B=new ArrayList<Integer>(N2);
		System.out.println("Enter the elements first array");
		for(int i=0;i<N1;i++)
			A.add(sc.nextInt());
		System.out.println("Enter the elements second array");
		for(int i=0;i<N2;i++)
			B.add(sc.nextInt());
		System.out.println("the elements of array:");
		System.out.println("A"+ " "+A);
		System.out.println("B"+ " "+B);
		Collections.sort(A);
		Collections.sort(B);
		System.out.println("the product is: "+(A.get(0)*B.get(N2-1)));
}
}
