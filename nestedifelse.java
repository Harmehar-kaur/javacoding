//if first statement is true other statements don't work. 
import java.util.Scanner;

public class nestedifelse {
    public static void main(String args[]) {
        int n, k;
        System.out.println("Enter the numbers: ");
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
            k = s.nextInt();
        }
        if (n > k) {
            System.out.println("First number is greater");
        } else if (k > n) {
            System.out.println("Second number is greater");
        } else {
            System.out.println("Both are equal");
        }

    }
}
