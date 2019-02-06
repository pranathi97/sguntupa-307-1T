import java.util.Scanner;

public class Mult{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter first number: ");
      int a = scan.nextInt();
      System.out.print("Enter first number: ");
      int b = scan.nextInt();
      scan.close();
      int product = multiplier(a,b);
      System.out.println("Answer: " + product);
   }

   public static int multiplier(int a, int b) {
	return a*b;
   }
}