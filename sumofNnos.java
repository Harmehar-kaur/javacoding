import java.util.Scanner;

public class sumofNnos {
    public static void main(String args[]) {
        int n;
        System.out.println("Enter the number of natural nos. to be added: ");
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
        }
        int i = 1;// Next num to be added
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
        System.out.println("Harmehar Kaur");


    }

}
