    import javax.swing.JOptionPane;
	
	public class Oddeven
	{
	  public static void main(String[] args)
	  {
		String[] result = new String [4];
		result[0] = "System generated Even, you guessed Even, you win ! ";
		result[1] = "System generated Odd, you guessed Even, you lost ;-( ";
		result[2] = "System generated Even, you guessed Odd, you lost ;-("; 
		result[3] = "System generated Odd, you guessed Odd, you win !";		


	    int round = 0 , odd = 0, even=0, win = 0, lose = 0, winpercent;
	    Myobject numberrd = new Myobject();
	    Myobject evennumber = new Myobject();		
	    Myobject oddnumber = new Myobject();
	    String a= "Win" , b="Lose" ;

	    	do
	    	{
	    		
	    		int rnum = numberrd.GetANumber() ;
	    		 String oddeven = JOptionPane.showInputDialog("Rolling the dice...\nNumber betwwn 0 to 6\nPlease pick ODD or EVEN:");
	    		round++;

	    		    {
	    	if (oddeven.toUpperCase().equals("ODD"))
	     {
	    		
	    	String ssodd = ( oddnumber.arrayodd(rnum)) ? a:b ;
	    		
	    		if (ssodd == a)
	 	    	{
	    			
	    			System.out.printf("Game # %d: %s\n",round, result[3]);
	 	    		win++;
	 	    		odd++;
	 	    	}else{
	 	    		System.out.printf("Game # %d: %s\n",round,result[2]);
	 	    	lose++;
	 	    	even++;
	 	    	}    
	    		//break;
	    		
	      }
	    		 else if (oddeven.toUpperCase().equals("EVEN"))    		  
	      {
	     String sseven = (evennumber.arrayeven(rnum)) ? a : b ;
	     
	    	if ( sseven == a )
 	    	{
	    		
	    		System.out.printf("Game # %d: %s\n",round,result[0]);
 	    		win++;
 	    		even++;
 	    	}else{
 	    		System.out.printf("Game # %d: %s\n",round,result[1]);
 	    	lose++;
 	    	odd++;
 	    	}    
	    	//break;
	        }
	    	
	      }   
	    		 
	      }while (Myobject.Asktheplayer());
	    	winpercent = win * 100 / round;
	    	System.out.printf("You win: %d times\nYou lose: %d times\n", win, lose) ;
	    	System.out.printf("You have played %d number of times\n",round);
	    	System.out.printf("The system generate %d number of Odds and %d number of Evens\n",odd,even);
	    	System.out.println("Your Winning percentage is "+ winpercent + "%");
	    	
	    	
	  }

	}
 
  
	
	  


