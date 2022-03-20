
//for nested if else and if-else if-else as well 
import java.util.Scanner;

public class conditionals {
    public static void main(String args[]) {
        int n, k;
        System.out.println("Enter the numbers: ");
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
            k = s.nextInt();
        }
        if (n > k) {
            System.out.println("First num is greater");
        } else {
            if (k > n) {
                System.out.println("Second num is greater");
            } else {
                System.out.println("Both are equal");
            }
        }

        System.out.println("Harmehar Kaur");
    }

}
