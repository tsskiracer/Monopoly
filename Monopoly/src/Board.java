import java.util.*;

public class Board
	{
		private String name;
		private int cost;
		private int rent;
		static ArrayList<Board> position = new ArrayList<Board>();
		public Board (String n, int c, int r)
		{
			name=n;
			cost=c;
			rent=r;
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public int getCost()
			{
				return cost;
			}
		public void setCost(int cost)
			{
				this.cost = cost;
			}
		public int getRent()
			{
				return rent;
			}
		public void setRent(int rent)
			{
				this.rent = rent;
			}
		public static void fillList()
			{
			position.add(new Board("Go", 200, 0));
			position.add(new Board("Mediteranean Avenue", -200, 0));
			position.add(new Board("Community Chest", 0, 0));
			position.add(new Board("Baltic Avenue", -200, 0));
			position.add(new Board("Income Tax", -200, 0));
			position.add(new Board("Reading Railroad", -200, 0));
			position.add(new Board("Oriental Avenue", -200, 0));
			position.add(new Board("Chance", 0, 0));
			position.add(new Board("Vermont Avenue", -200, 0));
			position.add(new Board("Connecticut Avenue", -200, 0));
			position.add(new Board("Just Visiting", 0, 0));
			position.add(new Board("St. Charles Place", -200, 0));
			position.add(new Board("Electric Company", -200, 0));
			position.add(new Board("States Avenue", -200, 0));
			position.add(new Board("Virginia Avenue", -200, 0));
			position.add(new Board("Pennsylvania Railroad", -200, 0));
			position.add(new Board("St. James Place", -200, 0));
			position.add(new Board("Community Chest", 0, 0));
			position.add(new Board("Tennessee Avenue", -200, 0));
			position.add(new Board("New York Avenue", -200, 0));
			position.add(new Board("Free Space", 0, 0));
			position.add(new Board("Kentucky Avenue", -200, 0));
			position.add(new Board("Chance", 0, 0));
			position.add(new Board("Indiana Avenue", -200, 0));
			position.add(new Board("Illinois Avenue", -200, 0));
			position.add(new Board("B&O Railroad", -200, 0));
			position.add(new Board("Atlantic Avenue", -200, 0));
			position.add(new Board("Ventnor Avenue", -200, 0));
			position.add(new Board("Water Works", -200, 0));
			position.add(new Board("Marvin Gardens", -200, 0));
			position.add(new Board("Go To Jail", 0, 0));
			position.add(new Board("Pacific Avenue", -200, 0));
			position.add(new Board("North Carolina Avenue", -200, 0));
			position.add(new Board("Community Chest", 0, 0));
			position.add(new Board("Pennsylvania Avenue", 200, 0));
			position.add(new Board("Short Line", 200, 0));
			position.add(new Board("Chance", 0, 0));
			position.add(new Board("Park Place", 200, 0));
			position.add(new Board("Luxury Tax", 200, 0));
			position.add(new Board("Boardwalk", 200, 0));
			}
		public static void importList()
			{
				int boardA[]= new int[40];
				for (int i=0; i<boardA.length; i++)
					{
						board.get(i).getName
					}
			}
	}


