import java.util.Scanner;
class Calculator
{
  public static void main ( String[] args)
  { 
      Scanner input = new Scanner(System.in);
    int so1;
    int so2;
   
    System.out.print("Enter first number :");
      so1 = input.nextInt();
     System.out.print("Enter second number :");
      so2 = input.nextInt();
   // System.out.printf(" Hello, you enter %d and %d\n ", so1 , so2 ) ;
      System.out.printf(" The sum is : %d\nThe difference is : %d\nThe product is : %d\nThe quotient is : %f\n ", so1 + so2, so1 - so2, so1 * so2, so1 / (float)so2   ) ;
      input.close();
  }
}