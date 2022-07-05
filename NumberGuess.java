import java.util.Scanner;    // Needed for Scanner class
import java.util.Random;
/**
 *  This program demonstrates keyboard input.
 */
public class NumberGuess
{
   public static void main(String[] args)
   {
      int userGuess;    // To hold rectangle's length.
	  Random randomNum = new Random();
      int computerNumber=randomNum.nextInt(100);     // To hold rectangle's width.
      int area;      // To hold rectangle's area
	  int count=1;

      // Create a Scanner object to read input.
      Scanner console = new Scanner(System.in);
	String preString= "";
	String postString=" ---<ComputerNumber>--- ";
      // Get length from the user.
	  System.out.print("Welcome Jovi and Karthik to the Computer Number Guess Game!!!!");
	  System.out.print("\n\n\nAll you need to do is guess a number which Computer is thinking and guess it in 10 times!!! ");
	  System.out.print("\n\nComputer is Thinking of a number give Computer some time to think.......... ");
	  System.out.println("\n\nPress enter to continue");
		try{System.in.read();}
				catch(Exception e){}
				
		while(count<=10)
		{			
			  System.out.print("\n\n ----------- Chance  :"+count+" ----------");
			  
			  System.out.print("\nGuess the Number between 1-100...Type your Number(Chance#"+count+") :");
			  userGuess = console.nextInt();
			  if (userGuess>computerNumber)
			  {
				  postString = postString+ userGuess+",";
				  System.out.print("\n\n"+preString+postString);
				  System.out.print("\n\n ***HINT***   Computer Number is less than your Number ");
			  }
			  else if(userGuess<computerNumber)
			  {
				  preString = preString+ userGuess+",";
				  System.out.print("\n\n"+preString+postString);
				  System.out.print("\n\n  ***HINT***  Computer Number is Greater than your Number");
			  }
			  
			  else if(userGuess==computerNumber)
			  {
				   System.out.print("\n\nHurray!!!! You Won the Game!!!!!");
				   System.exit(0);
				   break;
			  }
			  count++;
			  
		}
		System.out.print("\n\nBAD LUCK DEAR!!!!!!");
      
   }
}