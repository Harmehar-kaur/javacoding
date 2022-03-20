import java.util.Scanner;

public class logicaloperators { 
    public static void main(String args[]) {
        int n, k;
        System.out.println("Enter the numbers: ");
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
            k = s.nextInt();
        }
        System.out.println("Logical Operators: And[&&],Or[||] and Not[!]");
        System.out.println(n>=10 && k==10);
        System.out.println(n==10 || k>10);
        System.out.println(!(k>10));
        System.out.println("Harmehar Kaur");
    }
}
