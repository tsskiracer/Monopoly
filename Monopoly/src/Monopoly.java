import java.util.ArrayList;
import java.util.Scanner;

public class Monopoly
	{
		private String name;
		private int cost;
		private int rent;
		static ArrayList<Board> position = new ArrayList<Board>();

		public Monopoly(String n, int c, int r) {
			name = n;
			cost = c;
			rent = r;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

		public int getRent() {
			return rent;
		}

		public void setRent(int rent) {
			this.rent = rent;
		}

		public static void fillList() {
			position.add(new Board("Go", 200, 0));
			position.add(new Board("Mediteranean Avenue", 60, 0));
			position.add(new Board("Community Chest", 0, 0));
			position.add(new Board("Baltic Avenue", 60, 0));
			position.add(new Board("Income Tax", -200, 0));
			position.add(new Board("Reading Railroad", 200, 0));
			position.add(new Board("Oriental Avenue", 100, 0));
			position.add(new Board("Chance", 0, 0));
			position.add(new Board("Vermont Avenue", 100, 0));
			position.add(new Board("Connecticut Avenue", 120, 0));
			position.add(new Board("Just Visiting", 0, 0));
			position.add(new Board("St. Charles Place", 140, 0));
			position.add(new Board("Electric Company", 150, 0));
			position.add(new Board("States Avenue", 140, 0));
			position.add(new Board("Virginia Avenue", 160, 0));
			position.add(new Board("Pennsylvania Railroad", 200, 0));
			position.add(new Board("St. James Place", 180, 0));
			position.add(new Board("Community Chest", 0, 0));
			position.add(new Board("Tennessee Avenue", 180, 0));
			position.add(new Board("New York Avenue", 200, 0));
			position.add(new Board("Free Space", 0, 0));
			position.add(new Board("Kentucky Avenue", 220, 0));
			position.add(new Board("Chance", 0, 0));
			position.add(new Board("Indiana Avenue", 220, 0));
			position.add(new Board("Illinois Avenue", 240, 0));
			position.add(new Board("B&O Railroad", 200, 0));
			position.add(new Board("Atlantic Avenue", 260, 0));
			position.add(new Board("Ventnor Avenue", 260, 0));
			position.add(new Board("Water Works", 150, 0));
			position.add(new Board("Marvin Gardens", 280, 0));
			position.add(new Board("Go To Jail", 0, 0));
			position.add(new Board("Pacific Avenue", 300, 0));
			position.add(new Board("North Carolina Avenue", 300, 0));
			position.add(new Board("Community Chest", 0, 0));
			position.add(new Board("Pennsylvania Avenue", 320, 0));
			position.add(new Board("Short Line", 200, 0));
			position.add(new Board("Chance", 0, 0));
			position.add(new Board("Park Place", 350, 0));
			position.add(new Board("Luxury Tax", 200, 0));
			position.add(new Board("Boardwalk", 400, 0));
		}

		public static void importList()
				{
					String boardA[]= new String[40];
					for (int i=0; i<boardA.length; i++)
						{
							boardA[i]=position.get(i).getName();
							
						}
				}
		public static void main(String[] args) {
			int location=0;
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello and welcome to single player Monopoly where you cannot lose. When you would like to quit, please type 'Exit' (case sensitive).");
			String endCode=userInput.next();
			String codeEnd="Exit";
			do 
			{
				importList();
				System.out.println("User is on " + importList.boardA[location]);
				int diceRoll1=((int) ((Math.random()*5)+1));
				int diceRoll2=((int) ((Math.random()*5)+1));
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
	
