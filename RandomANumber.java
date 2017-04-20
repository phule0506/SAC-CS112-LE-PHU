import java.util.Scanner;
import javax.swing.JOptionPane;

public class RandomANumber {

	public static void main(String args[]) {

		int guesspercent, goodguess = 0, badguess = 0, guessnumber = 0, number, count = 1;
		int hi;
		int lo;
		String a = " You Won", b = " You Lose";
		// create a RandomNumber object and assign it to mynumberrd
		Scanner input = new Scanner(System.in);
		// RandomNumber inputnumberlo = new RandomNumber();
		// RandomNumber inputnumberhi = new RandomNumber(hi);
		do {
			// if numberrd is not put under the DO statement, it will keeps the
			// same numberrd
			System.out.print("Please choose the minimum number:");
			lo = input.nextInt();

			System.out.print("Please choose the maximum number:");
			hi = input.nextInt();
			RandomNumber mynumberrd = new RandomNumber(hi, lo);
			// inputnumberhi.SetLowNumber(hi);
			int rnum = mynumberrd.GetANumber();// call RandomNumber's
												// Getanumberbetween1and10()
												// method; then assignt it to
												// int rnum
			int c = mynumberrd.GetLowNumber();
			int d = mynumberrd.GetHighNumber();
			System.out.printf("Round %d\n", count);
			System.out.printf("The lower boundary is %d, the upper boundary is %d\n", c, d);
			System.out.printf(" Chose a number from %d to %d  : ", lo, hi);
			number = input.nextInt();
			String ss = (number == rnum) ? a : b;
			System.out.println(ss);
			if (ss == a) {
				goodguess++;
			} else {
				badguess++;
			}
			count++;
			guessnumber++;
		} while (asking());
		guesspercent = goodguess * 100 / guessnumber;
		System.out.printf("You have guess %d times\nThe number of good guess : %d\nThe number of bad guess : %d\n",
				guessnumber, goodguess, badguess);
		System.out.println("The overall guess percentage :" + guesspercent + "%");
		input.close();
	}

	public static boolean asking() {
		while (true) {
			String yesno;
			yesno = JOptionPane.showInputDialog("Do you want to continue ? (Y/N)");
			if (yesno.toUpperCase().equalsIgnoreCase("Y")) {
				return true;
			} else if (yesno.toUpperCase().equalsIgnoreCase("N")) {
				System.out.println("Wrong input");
				return false;
			}
		}
	}
}