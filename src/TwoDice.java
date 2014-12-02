
public class TwoDice extends GameEngine
{	
	public TwoDice( int rNum ) 
	{
		super();
		System.out.println("Dice No.1 - Random Number = " + d1 +
							"\nDice No.2 - Random Number = " + d2);
		Throw = d1 + d2;
	} // end constructor TwoDice
	

} // end class TwoDice