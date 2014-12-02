import java.util.Random;

public class GameEngine 
{
	int rNum = 0;
	int Throw = 0;
	int count = 0;
	int d1 = 0;
	int d2 = 0;
	int d3 = 0;
	int throwSum = 0;
	Random randNum = new Random();
	
	public GameEngine() 
	{
		// Generate a random number in the range of
		// 	1 through 6.
		d1 = randNum.nextInt(6) + 1;
		d2 = randNum.nextInt(6) + 1;
		d3 = randNum.nextInt(6) + 1;
		Throw = d1 + d2 + d3;
	} // end constructor GameEngine
	
    public void Throw() 
    {
    	throwSum = randNum.nextInt(Throw) + 1;
    }
    
    public String getThrow( int numOfGet )
    {
		throwSum = Throw;
		System.out.println( "Total Value of ALL Dices = " + throwSum );
		
		if (throwSum <= 3)
		{
			throwSum = 1;
		}
		else if (throwSum >= 4)
		{
			throwSum = 6;
		}
		// Return the computer's choice.
		return Translation.getChoice(numOfGet);
    }
    
    
} // end class GameEngine