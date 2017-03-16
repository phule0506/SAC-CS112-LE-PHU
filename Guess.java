import java.util.Scanner;
public class Guess
{
  public static void main(String args[])
{
  Scanner input= new Scanner(System.in);
  int number;
  int numberrd;
  numberrd = 0 + (int)(Math.random() * 9);
  System.out.print(" Chose a number from 0-9 : ");
  number = input.nextInt();
  if ( number == numberrd )
  { System.out.println(" You Won ");
  } else {
    System.out.println(" You Lose");
  }
}
}
