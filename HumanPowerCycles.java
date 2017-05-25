package quiz;

public class HumanPowerCycles {
	    public int gearNum, wheelNum;
	 int currentGear;
       String color, name;
      
	public HumanPowerCycles(int numberofwheel,int numberofgear,String Name,String Color){
		wheelNum = numberofwheel;
		gearNum = numberofgear;
		color = null;
		name= Name;
	}
	public void SetCurrentGear(int gear){
		if(gear>=0 && gear <=gearNum)
			currentGear = gear;
	
	}
	public int GetCurrentSpeed(){
		return 0;
	}
	

}

