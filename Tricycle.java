package quiz;

public class Tricycle extends HumanPowerCycles {
	private int x ;
	
	

	public Tricycle(int numberofwheel,int numberofgear,String Name,String Color){
		super( 2, 5, Name, Color);
	}
	public int GetCurrentSpeed(){
		
		if (currentGear == 1 ){
			x= 6 ;
		}
		if (currentGear == 2){
			x=  7 + 6;
		}
		if (currentGear == 3){
			x= 7 + 6+ 8;
		}
		if (currentGear == 4){
			x= 7 + 6+ 8 + 9;
		}
		if (currentGear >= 5){
			x= 7 + 6+ 8+9+10;
		}
		
		return x;
		
		
	}
	

}

