import java.util.Scanner;

public class loop {
    public static void main(String arg[]) {
        int k=1;
        System.out.println("Enter the character:");
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
        
        while(k<=n)
        {
            System.out.println("hello");
            System.out.println(k);
            k= k+1;    
        }
        }
            System.out.println("Harmehar Kaur");
    }
}