import java.util.Scanner;

public class checkprimality {
    public static void main(String args[]) {

        int n;
        System.out.println("Enter the number");
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
        }
        int div = 2;

        while (div <= n - 1) {
            if (n % div == 0) {
                System.out.println("The number is Composite");
                return; // return will exit from main no other line will be executed after return
            }
            div = div + 1;
        }

        System.out.println("The number is Prime");

        System.out.println("Harmehar kaur");

    }
}