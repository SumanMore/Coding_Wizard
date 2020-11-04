package codingwizard;
import java.util.Scanner;

public class q4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date,month,year ");
        int date=sc.nextInt();
        String month=sc.next();
        int year=sc.nextInt();
        int days=date;
        int  dfeb=((year% 4 == 0 && year % 100 != 0 ) || (year % 400 == 0))?29:28;
           
        
        switch(month){
        case "February":
            days += 31;
            break;
        case "March":
            days += 31+dfeb;
            break;
        case "April":
            days += (31*2)+dfeb;    
            break;
        case "May":
            days += (31*2)+dfeb+30;    
            break;
        case "June":
            days += (31*3)+dfeb+30;    
            break;
        case "July":
            days += (31*3)+dfeb+(30*2);    
            break;            
        case "August":
            days +=(31*4)+dfeb+(30*2);    
            break;
        case "September":
            days += (31*5)+dfeb+(30*2);    
            break;
        case "October":
            days += (31*5)+dfeb+(30*3);           
            break;            
        case "November":
            days += (31*6)+dfeb+(30*3);                
            break;                        
        case "December":
            days += (31*6)+dfeb+(30*4);            
            break;  
           
        }
        System.out.println(days);
    }
}