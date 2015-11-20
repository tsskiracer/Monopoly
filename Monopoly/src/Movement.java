
public class Movement
	{

		public static void main(String[] args)
			{
				String board[]= new String [40];
				board[0]="Go";
				board[1]="Mediteranean Avenue";
				board[2]="Community Chest";
				board[3]="Baltic Avenue";
				board[4]="Income Tax";
				board[5]="Reading Railroad";
				board[6]="Oriental Avenue";
				board[7]="Community Chest";
				board[8]="Johnson Space Center, Houston";
				board[9]="Pioneer Square, Seattle";
				board[10]="Free Parking";
				board[11]="Waikiki Beach, Hawaii";
				board[12]="Chance";
				int position=0;
				int diceRoll=((int) ((Math.random()*12)+2));
				System.out.println("The user is on "+ board[position]);
				System.out.println("You rolled a " + diceRoll + ". You are on " + board[position+diceRoll]+".");

			}

	}
