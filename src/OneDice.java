
public class OneDice extends GameEngine
{	
	public OneDice( int rNum ) 
	{
		super();
		System.out.println("Dice No.1 - Random Number = " + d1);
		Throw = d1;
	} // end constructor OneDice
	
	@Override
    public void Throw() 
    {
    	throwSum = randNum.nextInt(Throw) + 1;
    }
    @Override
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
		return throwSum;
    }
	
} // end class OneDice