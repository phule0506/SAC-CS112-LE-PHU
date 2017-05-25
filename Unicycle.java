package quiz;

public class Unicycle extends HumanPowerCycles{
	private int x ;
	
	

	public Unicycle(int numberofwheel,int numberofgear,String Name,String Color){
		super( 1, 3, Name, Color);
	}
	public int GetCurrentSpeed(){
		
		if (currentGear == 1 ){
			x= 5 ;
		}
		if (currentGear == 2){
			x=  5 + 6;
		}
		if (currentGear >= 3){
			x= 5 + 6+ 8;
		}
		return x;
		
		
	}
	

}
