import java.util.Scanner;
import javax.swing.JOptionPane;

public class Guess4
{
public static void main(String args[])
{
 int guesspercent,goodguess = 0,badguess = 0,guessnumber = 0,number, count = 1  ;
 int inputnumber;
String a = " You Won", b = " You Lose";
RandomNumber mynumberrd = new RandomNumber();// create a RandomNumber object and assign it to mynumberrd
Scanner input= new Scanner(System.in);
//numberrd = 0 + (int)(Math.random() * 9);
do {
// if numberrd is not put under the DO statement, it will keeps the same numberrd
//numberrd = 0 + (int)(Math.random() * 9); 
    System.out.print("Please choose the maximun number:");
    inputnumber = input.nextInt();
int rnum = mynumberrd.GetANumber(inputnumber);//call RandomNumber's Getanumberbetween1and10() method; then assignt it to int rnum

                                               
System.out.printf("Round %d\n", count);
System.out.printf(" Chose a number from 0-%d : ", inputnumber);
number = input.nextInt();
String ss = ( number == rnum) ? a : b;
System.out.println(ss);
if (ss == a )
{ goodguess++;
}
else 
{badguess++;
}
count++ ;
guessnumber++;
}while(asking());
guesspercent = goodguess*100 / guessnumber ;
 System.out.printf("You have guess %d times\nThe number of good guess : %d\nThe number of bad guess : %d\n", guessnumber,goodguess, badguess);
System.out.println("The overall guess percentage :"+guesspercent+"%" );
 input.close();
 }
public static boolean asking()
{
    while(true)
    {
 String yesno;
 yesno = JOptionPane.showInputDialog("Do you want to continue ? (Y/N)");
if (yesno.toUpperCase().equalsIgnoreCase("Y"))
{
  return true;
}
else if (yesno.toUpperCase().equalsIgnoreCase("N"))
        { System.out.println("Wrong input");
    return false;
}
          }
}
}