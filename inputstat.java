import java.util.Scanner;

public class inputstat {
    public static void main(String args[]) {
        try (/*
                 * int a,b;
                 * Scanner s=new Scanner(System.in);
                 * a=s.nextInt();
                 * b=s.nextInt();
                 * int c=a+b;
                 * System.out.println(c);
                 */
                /*
                 * String str=s.nextLine();
                 * char ch=str.charAt(0);
                 * System.out.println(ch);
                 * s.nextDouble();
                 * s.nextLong(); for other data types
                 */
        Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a + b);
        }
    }

}
