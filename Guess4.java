import java.util.Scanner;
import javax.swing.JOptionPane;
public class Guess4
{
public static void main(String args[])
{
int count = 1 ;
int guessnumber = 0 ;
 String yesno;
 int guesspercent;
 int goodguess = 0;
 int badguess = 0;
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
if (ss == a )
{ goodguess++;
}
else 
{badguess++;
}
count++ ;
guessnumber++;


 yesno = JOptionPane.showInputDialog("Do you want to continue ? (Y/N)");
if (yesno.equals("Y"))
{
  continue;
}
else if (yesno.equals("N"))
             { 
  System.out.println("See ya ");
  break;
}else
{
 System.out.println("Wrong input");
     System.exit(0);
}
          }
guesspercent = badguess*100 / guessnumber ;
 System.out.printf("You have guess %d times\nThe number of good guess : %d\nThe number of bad guess : %d\n", guessnumber,goodguess, badguess);
System.out.println("The overall guess percentage :"+guesspercent+"%" );
 input.close();
}
}
