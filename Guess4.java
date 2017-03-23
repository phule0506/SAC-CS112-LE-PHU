import java.util.Scanner;
public class Guess4
{
public static void main(String args[])
{
int count = 1 ;
 String yesno;
int number;
int numberrd;
String a = " You Won";
String b = " You Lose";
Scanner input= new Scanner(System.in);
numberrd = 0 + (int)(Math.random() * 9);
//do {
while(true) {
System.out.printf("Round %d\n", count);
System.out.print(" Chose a number from 0-9 : ");
number = input.nextInt();
String ss = ( number == numberrd) ? a : b;
System.out.println(ss);
count++ ;
System.out.print("Do you want to continue ? (Y/N)");
 yesno = input.next();
if (yesno.equals("Y"))
{
  continue;
}
else
{
  System.out.println("See ya ");
  break;
}
}
//while ( count < 4 );
}
}
