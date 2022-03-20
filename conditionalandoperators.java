import java.util.Scanner;

public class conditionalandoperators {
    public static void main(String args[]) {
        int n, k;
        System.out.println("Enter the numbers to be checked: ");
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
            k = s.nextInt();
        }
        if(n>0 && k>0){
            System.out.println("Both are positive"); 
        } else{
            System.out.println("Both are not positive");
        }
        System.out.println("Harmehar Kaur");
    }
}
