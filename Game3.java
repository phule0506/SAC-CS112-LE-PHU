import java.util.Scanner;
public class Game3
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
            int ng1;
            int ng2;
            System.out.print(" Player A please pick 1 = hammer, 2 = scissor, 3 = paper :");
                                 ng1 = input.nextInt() ;
            System.out.print(" Player B please pick 1 = hammer, 2 = scissor, 3 = paper :");
            ng2 = input.nextInt() ;
        if (ng1 == 1 )
        {
            if ( ng2 == 1) 
            {
                System.out.println(" Draw " );
            }
            else if ( ng2 == 2 )
            {
                System.out.println(" You Won " );
            }
            else 
            {
                System.out.println("You Lose");
            }
        }
         else if ( ng1 == 2 )
        {
             if ( ng2 == 1) 
            {
                System.out.println(" You Lose " );
            }
            else if ( ng2 == 2 )
            {
                System.out.println(" Draw " );
            }
            else 
            {
                System.out.println("You Won");
            }
        }
         else if ( ng1 == 3 )
        {
             if ( ng2 == 1) 
            {
                System.out.println(" You Won " );
            }
            else if ( ng2 == 2 )
            {
                System.out.println(" You Lose " );
            }
            else 
            {
                System.out.println("Draw");
            }
        }
         
         input.close();
    }
}
