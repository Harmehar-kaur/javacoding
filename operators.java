import java.util.Scanner;

public class operators {
    public static void main(String args[]) {
        int a, b;
        System.out.println("Relational Operators: Output is always in boolean");
        System.out.println(",i.e.,either true or false");
        System.out.println("Enter the numbers: ");
        try (Scanner s = new Scanner(System.in)) {
            a = s.nextInt();
            b = s.nextInt();
        }
        System.out.println(a > b); // greater than
        System.out.println(a < b);// less than 
        System.out.println(a == b);// equal to
        System.out.println(a != b);// not equal to
        System.out.println(a >= b);// greater than equal to 
        System.out.println(a <= b); // less than equal
        System.out.println("Harmehar Kaur");
    }

}
