package codingwizard;
import java.util.Scanner;
public class q2
{
  public static void main(String[]args)
      {
        Scanner obj= new Scanner(System.in);
       
	int c=1,scoreuser=0,scorecomputer=0,c1;char a='z';
	while(c<=3)
	{
		System.out.println("Enter User's Choice:R for rock, P for paper, S for scissors");
	char ch=obj.next().charAt(0);
	if(ch!='R' && ch!='P'&& ch!='S') {
		System.out.println("Wrong choice");
		System.exit(0);}
		else {
		System.out.println("Computer's choice: ");
		char chr[]={'R', 'P','S'};
	c1=(1+(int)(Math.random() *2));
	a= chr[c1];
	System.out.println(a);
	}
	if(a==ch)
	System.out.println("Tie of round");
	else if(ch=='P'&& a=='R') {
		System.out.println("user won the round");
	scoreuser++;}
	else if(ch=='P'&& a=='S')
	{
	scorecomputer++;
	System.out.println("computer won the round");
	}
	else if(ch=='R'&& a=='P')
	{
	scorecomputer++;
	System.out.println("computer won the round");
	}
	else if(ch=='R'&& a=='S')
	{
	scoreuser++;
	System.out.println("user won the round");
	}
	else if(ch=='S'&& a=='R') {
	scorecomputer++;
	System.out.println("computer won the round");
	}
	else if(ch=='S'&& a=='P') {
	scoreuser++;
	System.out.println("user won the round");
	}
	c++;
	}
	if(scoreuser==scorecomputer)
	System.out.println("Tie of game");
	else if(scoreuser>=2)
	System.out.println("3 rounds over, user scored "+scoreuser+" user won the game");
	else 
		System.out.println("3 rounds over, user scored "+scoreuser+" computer won the game");
    }
}