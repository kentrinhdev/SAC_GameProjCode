import java.util.Scanner;

public class mainCode 
{
	public static void main(String[] args) 
	{
		int rollCount = 0;
		int dNum = 0;
	    String computer;
	    String user;
		String play;
		Scanner scan = new Scanner(System.in);
		
    	// Play the game as long as there is a tie.
    	// Create a new object called winner
    	DetermineWinner winner = new DetermineWinner();
	   		
    	do
    	{
    			do 
    			{
    				System.out.print("\nHow many Dice do you want to play with?" +
							"\n1 = One Dice 2 = Two Dice 3 = Three Dice ");
    						dNum = scan.nextInt();
    						System.out.println("\nPlayer selected " + dNum + " Dices to play with: ");
    						    						
    		    			if (dNum < 1 || dNum > 3)
    		    			{
    		    		    	System.out.println("This is an Invalid Selection. Please Try Again.");
    		    			}	
		
    						if (dNum == 1)
    						{
    							OneDice oneD = new OneDice(dNum);
    							oneD.Throw();
    							System.out.println("All Dice thrown are = " +
    												oneD.getThrow(dNum));
    							TransD1 transDice1 = new TransD1(dNum);
    							transDice1.getChoice(dNum);
    							
    			    			// Get the user's choice.
    			    			// Call userChoice method from RandomClass.java
    			    			user = UserChoice.userChoice(scan);
    							
    							rollCount++;
    						}
    							else if (dNum == 2)
    							{
    								TwoDice twoD = new TwoDice(dNum);
        							twoD.Throw();
        							System.out.println("All Dice thrown are = " +
        												twoD.getThrow(dNum));
        							TransD2 transDice2 = new TransD2(dNum);
        							transDice2.getChoice(dNum);
        							
        			    			// Get the user's choice.
        			    			// Call userChoice method from RandomClass.java
        			    			user = UserChoice.userChoice(scan);
        							
        							rollCount++;
    							}
    							else if (dNum == 3)
    							{
    								ThreeDice threeD = new ThreeDice(dNum);
        							threeD.Throw();
        							System.out.println("All Dice thrown are = " +
        												threeD.getThrow(dNum));
        							TransD3 transDice3 = new TransD3(dNum);
        							transDice3.getChoice(dNum);
        							
        			    			// Get the user's choice.
        			    			// Call userChoice method from RandomClass.java
        			    			user = UserChoice.userChoice(scan);
        							
        							rollCount++;
    							}	
    			}
    			while (dNum >=1 & dNum <=3);
    			// Exit inside Do-While Loop

    			System.out.print("\nDo you want to play again? Yes or No ");
    			play = scan.next();
    	}
    	while(play.equalsIgnoreCase("YES"));
    	// Exit outside Do-While Loop
    	
    	System.out.println("\nDice was Thrown a Total of " + rollCount + " times." + 
    						"\nGame Over. Thank you for playing!" +
    						"\nPlay Again Later. Good-Bye!");
    	
		scan.close();

		
	} // end static void main
} // end class mainCode