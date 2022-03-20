import java.util.Scanner;

public class assignment2 {

    public static void main(String[] args) {
        System.out.println("Enter the character:");
        try (Scanner input = new Scanner(System.in)) {
            char ch = input.next().charAt(0);
            int n = ch;
            if (n >= 65 && n <= 90) {
                System.out.print("1");
            } else if (n >= 97 && n <= 122) {
                System.out.print("0");
            } else {
                System.out.print("-1");
            }
        }

    }
}