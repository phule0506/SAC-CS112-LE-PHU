import javax.swing.JOptionPane;
public class Dice {
	private int x;
	public Dice(int number) {
		x = number;

	}
	public int GetAnumber() {
		int random = x + (int) (Math.random() * ((6 * x + 1) - x));
		return random;
	}
	 public static boolean Asktheplayer()
	 {
	  String yesno;
	  while(true)
	     {
	      
	       yesno = JOptionPane.showInputDialog("Do you want to continue ? (Y/N)");
	       if (yesno.toUpperCase().equalsIgnoreCase("Y"))
	       {
	         return true;
	       }
	       else if (yesno.toUpperCase().equalsIgnoreCase("N"))
	       {     
	         return false;
	       }
	       else { 
	        System.out.println("Wrong input");
	       }
	       }
	     }
}
