import java.util.Scanner;
public class checkprimality {
    public static void main(String args[]) {
     
      int n;
      System.out.println("Enter the number");
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int div=2;
      boolean isPrime=true;
      
      while(div<=n-1){
          if(n%div==0){
          isPrime=false;
          
      }
      div=div+1;
      }
      if(isPrime==true){
          System.out.println("The number is Prime");
      }else{
          System.out.println("The number is Composite");
      }
      System.out.println("Harmehar kaur");
      

    }
}