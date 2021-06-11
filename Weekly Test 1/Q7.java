import java.util.*;

public class wt1no7 {
    public static void main(String[] args) 
     {
        Scanner in = new Scanner(System.in);

        String s = in.next(); int c = 0;
       
        for (int i = 0; i < s.length(); i++) 
          {
            for (int j = i; j < s.length(); j++)
             {
                StringBuilder s1 = new StringBuilder(s.substring(i, j + 1));
                String s2= s.substring(i, j + 1);
                s1.reverse();
                if (s2.equals(s1.toString()))
                    c++;
            }
        }
        System.out.println(c);
    }
}
