import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
       try (Scanner in = new Scanner(System.in)) {
        int n = in .nextInt();
           int i=1;
           while (i<=10)
           {
           System.out.println(i*n);
           i++;
           }
    }
	}
}