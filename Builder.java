package quiz;

public class Builder {
	public static void main(String[] args){
		int i=0;
		Unicycle unispeed = new Unicycle(1,i,"W1u","red");
		Bicycle bispeed = new Bicycle(2,i,"W2b","blue");
		Tricycle trispeed = new Tricycle(2,i,"W3t","green");
		//HumanPowerCycles example = new HumanPowerCycles(1,i,"W1u","red");
		for(i=0;i<11;i++){
			unispeed.SetCurrentGear(i);
			bispeed.SetCurrentGear(i);
			trispeed.SetCurrentGear(i);
		
		System.out.print("A Unicycle name : "+ unispeed.name+" has " + i+ " gears "+" and 1 wheel ");
		System.out.printf("\nThe current speed is %d\n",unispeed.GetCurrentSpeed());
		
		System.out.print("A Unicycle name : "+ bispeed.name+" has " + i+ " gears "+" and 1 wheel ");
		System.out.printf("\nThe current speed is %d\n",bispeed.GetCurrentSpeed());
		
		System.out.print("A Unicycle name : "+ trispeed.name+" has " + i+ " gears "+" and 1 wheel ");
		System.out.printf("\nThe current speed is %d\n",trispeed.GetCurrentSpeed());
		}
		
	}

}
