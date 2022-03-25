import java.util.Scanner;

public class factors {
    public static void main(String args[]) {

        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int c = 2;
            while (n > 1) {
                if (n % c == 0) {
                    System.out.print(c + " ");
                    n /= c;
                } else
                    c++;
            }
        }
    }

}
