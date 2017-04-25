import javax.swing.JOptionPane;

 public class Myobject
 {
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

public int GetANumber ()
		  {
		    int numberrd;
		    numberrd = 0 + (int)(Math.random() * 7); 
		    return numberrd;//need to return the value
		}
public boolean arrayeven(int num)
{
	int[] evennumberobject = new int[4];
	int i;
	evennumberobject[0] = 0;
	evennumberobject[1] = 2;
	evennumberobject[2] = 4;
	evennumberobject[3] = 6;
    for(i=0;i <= evennumberobject.length-1;i++)
    if (num == evennumberobject[i])
    {
    	return true;
    }
    
    return false;
    
    	
}
public boolean arrayodd(int num)
{
    int[] oddnumberobject = new int[3] ;
    int i ;
    oddnumberobject[0]= 1;
    oddnumberobject[1]= 3;
    oddnumberobject[2]= 5;
    for(i=0;i <= oddnumberobject.length-1;i++)
    if (num == oddnumberobject[i])
    {
    	return true;
    }
    return false;
    
}
}

 

