
public class DiceLab {
	public static void main(String[] args){
	ThreeDice randomdice = new ThreeDice();
	TrippleDice averagethrow = new TrippleDice();
	int sumdice = randomdice.Throw();
	double averagedice= averagethrow.Throw();
	System.out.println(sumdice);
	System.out.println(averagedice);
	}

}
