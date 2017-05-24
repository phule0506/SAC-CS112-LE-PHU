
public class ThreeDice {
	public int D1(){
		int random = 1 + (int) (Math.random() * (7 - 1));
		return random;
	}
	public int D2(){
		int random = 1 + (int) (Math.random() * (7 - 1));
		return random;
	}
	public int D3(){
		int random = 1 + (int) (Math.random() * (7 - 1));
		return random;
	}
	public int Throw(){
	int sum = D1() + D2() + D3() ;
	return sum;
	}

	 

}
