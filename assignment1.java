import java.util.Scanner;
public class assignment1 {
     
        public static void main(String args[])
        {
        int m1,m2,m3;
        try (Scanner s = new Scanner(System.in)) {
                String str= s.next();
                m1= s.nextInt();
                m2= s.nextInt();
                m3= s.nextInt();
                int avg= (m1+m2+m3)/3;
                System.out.println(str);
                System.out.print(avg);
        }
        }
    
    
}
