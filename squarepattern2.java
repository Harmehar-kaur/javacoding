import java.util.Scanner;

public class squarepattern2 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            System.out.println("The pattern is: \n");
            int i = 1;
            while (i <= n) {
                int j = 1;
                while (j <= n) {
                    System.out.print(n-j+1);
                    j++;
                }
                System.out.println("\n");
                i++;
            }
        }
    }

}
