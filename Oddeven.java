//import java.util.Scanner;
import javax.swing.JOptionPane;
public class Oddeven
{
    public static void main(String[] args)
    {
       int[] evennumber = new int [4];
       int[] oddnumber = new int [4] ;
       int i;
       oddnumber[0]=1;
       oddnumber[1]=3;
       oddnumber[2]=5;
       evennumber[0] = 0;
       evennumber[1] = 2;
       evennumber[2] = 4;
       evennumber[3] = 6;
       String a = " Win ", b = " Lose " ;
       int numberrd ;
       //Scanner input = new Scanner(System.in);
        
       do
       {
           numberrd = 0 +(int)(Math.random() * 6 );
           for(i=0;i<
           String ssodd = (numberrd == oddnumber[]) ? a : b;
           String sseven =(numberrd == evennumber[]) ? a : b;
           String oddeven =JOptionPane.showInputDialog("Rolling the dice...\nNumber betwwn 0 to 6\nPlease pick ODD or EVEN:");
                if (oddeven.toUpperCase().equals("ODD"));
                {
                    System.out.println(ssodd);
               
                    
                }
            
            
            
            
       }
       while(true);
        
        
        input.close();
        
    }
    
    
}