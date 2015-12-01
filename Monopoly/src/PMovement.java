import java.util.*;

public class PMovement
	{

		static int bankAccount = 1500;
		static String board[] = new String[40];
		private String name;
		private int cost;
		private int rent;
		static ArrayList<Board> location = new ArrayList<Board>();

		public PMovement(String n, int c, int r)
			{
				name = n;
				cost = c;
				rent = r;
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
				location.add(new Board("Go", 200, 0));
				location.add(new Board("Mediteranean Avenue", 60, 0));
				location.add(new Board("Community Chest", 0, 0));
				location.add(new Board("Baltic Avenue", 60, 0));
				location.add(new Board("Income Tax", -200, 0));
				location.add(new Board("Reading Railroad", 200, 0));
				location.add(new Board("Oriental Avenue", 100, 0));
				location.add(new Board("Chance", 0, 0));
				location.add(new Board("Vermont Avenue", 100, 0));
				location.add(new Board("Connecticut Avenue", 120, 0));
				location.add(new Board("Just Visiting", 0, 0));
				location.add(new Board("St. Charles Place", 140, 0));
				location.add(new Board("Electric Company", 150, 0));
				location.add(new Board("States Avenue", 140, 0));
				location.add(new Board("Virginia Avenue", 160, 0));
				location.add(new Board("Pennsylvania Railroad", 200, 0));
				location.add(new Board("St. James Place", 180, 0));
				location.add(new Board("Community Chest", 0, 0));
				location.add(new Board("Tennessee Avenue", 180, 0));
				location.add(new Board("New York Avenue", 200, 0));
				location.add(new Board("Free Space", 0, 0));
				location.add(new Board("Kentucky Avenue", 220, 0));
				location.add(new Board("Chance", 0, 0));
				location.add(new Board("Indiana Avenue", 220, 0));
				location.add(new Board("Illinois Avenue", 240, 0));
				location.add(new Board("B&O Railroad", 200, 0));
				location.add(new Board("Atlantic Avenue", 260, 0));
				location.add(new Board("Ventnor Avenue", 260, 0));
				location.add(new Board("Water Works", 150, 0));
				location.add(new Board("Marvin Gardens", 280, 0));
				location.add(new Board("Go To Jail", 0, 0));
				location.add(new Board("Pacific Avenue", 300, 0));
				location.add(new Board("North Carolina Avenue", 300, 0));
				location.add(new Board("Community Chest", 0, 0));
				location.add(new Board("Pennsylvania Avenue", 320, 0));
				location.add(new Board("Short Line", 200, 0));
				location.add(new Board("Chance", 0, 0));
				location.add(new Board("Park Place", 350, 0));
				location.add(new Board("Luxury Tax", 200, 0));
				location.add(new Board("Boardwalk", 400, 0));
			}

		public static void importList()
			{
				String boardA[] = new String[40];
				for (int i = 0; i < boardA.length; i++)
					{
						boardA[i] = location.get(i).getName();

					}
			}

		public static void player()
			{
				int bank = 1500;
				String bankAccount = "$" + bank;
				String properties;

			}

		public static void board()
			{

				board[0] = "Go";
				board[1] = "Mediteranean Avenue";
				board[2] = "Community Chest";
				board[3] = "Baltic Avenue";
				board[4] = "Income Tax";
				board[5] = "Reading Railroad";
				board[6] = "Oriental Avenue";
				board[7] = "Chance";
				board[8] = "Vermont Avenue";
				board[9] = "Connecticut Avenue";
				board[10] = "Just Visiting";
				board[11] = "St. Charles Place";
				board[12] = "Electric Company";
				board[13] = "States Avenue";
				board[14] = "Virginia Avenue";
				board[15] = "Pennsylvania Railroad";
				board[16] = "St. James Place";
				board[17] = "Community Chest";
				board[18] = "Tennessee Avenue";
				board[19] = "New York Avenue";
				board[20] = "Free Space";
				board[21] = "Kentucky Avenue";
				board[22] = "Chance";
				board[23] = "Indiana Avenue";
				board[24] = "Illinois Avenue";
				board[25] = "B&O Railroad";
				board[26] = "Atlantic Avenue";
				board[27] = "Ventnor Avenue";
				board[28] = "Water Works";
				board[29] = "Marvin Gardens";
				board[30] = "Go to Jail";
				board[31] = "Pacific Avenue";
				board[32] = "North Carolina Avenue";
				board[33] = "Community Chest";
				board[34] = "Pennsylvania Avenue";
				board[35] = "Short Line";
				board[36] = "Chance";
				board[37] = "Park Place";
				board[38] = "Luxury Tax";
				board[39] = "Boardwalk";
			}

		public static void main(String[] args)
			{
				
				fillList();
				board();
				int turns = 0;
				int counter = 0;
				int location = 0;
				int x=0;
				String uProperties[]=new String[x];
				Scanner userInput = new Scanner(System.in);
				System.out.println(
						"Hello and welcome to single player Monopoly where you cannot lose.");
				System.out.println("Would you like to continue? Type 'y' for yes and 'n' for no.");
				String endGame=userInput.next();
				
				do
					{
						System.out.println("User is on " + board[location]);
						int diceRoll1 = ((int) ((Math.random() * 5) + 1));
						int diceRoll2 = ((int) ((Math.random() * 5) + 1));
						int diceRoll = diceRoll1 + diceRoll2;
						System.out.println("Hit 'r' to roll the dice.");
						String roll = userInput.next();
						counter++;
						if ((location + diceRoll) > 39)
							{
								location = location + diceRoll - 40;
							}

						else
							{
								location += diceRoll;
							}
						if (roll.equalsIgnoreCase("R"))
							{
								System.out.println("You rolled a " + diceRoll1 + " and a " + diceRoll2
										+ ". You landed on " + board[location] + ".");
								if (board[location].equals("Chance"))
									{
										int chanceAmt = (int) ((Math.random() * 750) + 100);
										bankAccount += chanceAmt;
										System.out
												.println("You have landed on chance. You have recieved $" + chanceAmt);

									}
								if (board[location].equals("Community Chest"))
									{
										int ccAmt = (int) ((Math.random() * 750) + 100);
										bankAccount += ccAmt;
										System.out.println(
												"You have landed on Community Chest. You have recieved $" + ccAmt);

									}
								if (board[location].equals("Go") && counter > 0)
									{
										System.out.println("You landed on go and have recieved $200");
										bankAccount += 200;
									}
								else 
									{
										System.out.println("Would you like to buy the property? It costs $" + 150 + ". If yes, type 'y'. If not, type 'n'.");
										String buy=userInput.next();
										if(buy.equalsIgnoreCase("y"))
											{
												System.out.println("You have now purchased this property. It has been added to your inventory.");
												uProperties[x]=board[location];
												bankAccount-=150;
												x++;
											}
										else
											{
												System.out.println("You will have a chance to buy it if you land on it again.");
											}
									}
								if (location == 30)

									{

										location = 10;
										System.out.println();
										System.out.println("You are in Jail.");

										do

											{
												System.out.println("Type 'r' when you are ready to roll.");
												String jRoll = userInput.next();
												if (jRoll.equalsIgnoreCase("r"))
													{

														int diceRollJ1 = ((int) ((Math.random() * 6) + 1));

														int diceRollJ2 = ((int) ((Math.random() * 6) + 1));

														System.out.println("You rolled a " + diceRollJ1 + " and a "
																+ diceRollJ2 + ".");

														if (diceRollJ1 == diceRollJ2)

															{

																location = diceRollJ1 + diceRollJ2 + 10;

																System.out.println("You got out of jail and moved "
																		+ (location - 10) + " places to "
																		+ board[location] + ".");

															}

														else

															{

																System.out.println("Sorry, you cannot leave yet.");

															}
														if (turns == 2)
															{
																location = diceRollJ1 + diceRollJ2 + 10;
																System.out.println("You must pay $50 to get out.");
																System.out.println("When you pay, you will move "
																		+ (location - 10) + " places which puts you on "
																		+ board[location] + ".");
															}
														turns++;
													}

											} while (location == 10 && turns < 3);
																			
									}
								

							}
						System.out.println("You have $" + bankAccount + " in your bank account.");
						System.out.print("You own ");
						if (x>0)
							{
								while (int i=0; i<uProperties.length; i++)
										{
											System.out.print(uProperties[i] + ",");
										}
							}
						else 
							{
								System.out.println("nothing.");
							}
						System.out.println(".");

					} while (endGame.equalsIgnoreCase("y"));
			}
	}