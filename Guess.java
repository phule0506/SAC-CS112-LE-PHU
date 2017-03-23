import java.util.Scanner;
public class Guess
{
  public static void main(String args[])
{

  int count = 1 ;
  int number;
  int numberrd;
  
  String a = " You Won";
  String b = " You Lose";
  //for ( int count = 1 ; count < 4 ; count++)
 
  do {
   System.out.printf("Round %d\n", count);
  Scanner input= new Scanner(System.in);

  numberrd = 0 + (int)(Math.random() * 9);
  System.out.print(" Chose a number from 0-9 : ");
  number = input.nextInt();
  
  String ss = ( number == numberrd) ? a : b;
  System.out.println(ss);
  count++ ; 
  input.close();
}
  while ( count < 4 );
  }
}
