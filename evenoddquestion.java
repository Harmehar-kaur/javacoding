import java.util.Scanner;

public class evenoddquestion {
    public static void main(String args[]){
        int n;
        System.out.println("Enter the numbers: ");
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
        }
        if (n % 2==0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
        System.out.println("If statement can occur without else wich isn't true conversely");
        System.out.println("Harmehar Kaur");
    
   }
}
