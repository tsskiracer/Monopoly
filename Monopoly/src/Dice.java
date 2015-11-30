
public class Dice extends Pieces
	{
		public static void main(String[] args)
			{
				int diceRoll1=((int) ((Math.random()*6)+1));
				int diceRoll2=((int) ((Math.random()*6)+1));
				int diceRoll=diceRoll1+diceRoll2;
			}
	}
