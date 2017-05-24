
public class TrippleDice extends ThreeDice {
	public int Throw(){
		
		
		int x_throw = (D1() + D2() +D3())/3;
		
		return  x_throw;
	}

}
