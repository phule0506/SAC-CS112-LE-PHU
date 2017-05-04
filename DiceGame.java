import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0, numberguess, guesswin = 0, guesslose = 0;
		String a = "WIN", b = "LOSE";
		
		do {
			
			Dice random = new Dice(number);
			System.out.print("Please enter the number of dice:");
			number = input.nextInt();
			System.out.printf("Please enter the number from %d to %d:", number,
					(number * 6));
			numberguess = input.nextInt();
			int rnum = random.GetAnumber();

			String winlose = (rnum == numberguess) ? a : b;
			System.out.println(winlose);

			if (winlose == a) {
				guesswin++;
				System.out.println("You win: " + guesswin + " times");
			} else {
				guesslose++;
				System.out.println("You lose: " + guesslose + " times");
			}
		} while (Dice.Asktheplayer());
		input.close();

	}

}
