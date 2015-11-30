import java.util.*;

public class PMovement {
	public static void main(String[] args) {
		int location=0;
		Board board=new Board();
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello and welcome to single player Monopoly where you cannot lose. When you would like to quit, please type 'Exit' (case sensitive).");
		String endCode=userInput.next();
		String codeEnd="Exit";
		do 
		{
			System.out.println("User is on " + boardA[location]);
			int diceRoll1=((int) ((Math.random()*6)+1));
			int diceRoll2=((int) ((Math.random()*6)+1));
			int diceRoll=diceRoll1+diceRoll2;
			System.out.println("Hit 'r' to roll the dice.");
			String roll=userInput.next();
			if ((location+diceRoll)>39)
				{
					location=location+diceRoll-40;
				}
				
				else
				{
					location+=diceRoll;
				}
			if (roll.equalsIgnoreCase("R"))
			{
				System.out.println("You rolled a " + diceRoll1 + " and a " + diceRoll2 + ". You landed on " + board[location]+".");
				if (board[location]="Chance")
				{
					Chance();
				}
				if (board[location]="Community Chest")
				{
					CC();
				}
				if (board[location]="Go")
				{
					
				}
			}
		} while (endCode/=codeEnd);
	}
}