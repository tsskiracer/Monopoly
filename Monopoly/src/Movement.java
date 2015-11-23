import java.util.*;

public class Movement

	{

		public static void main(String[] args)

			{

				String board[] = new String[40];

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

				int turns=0;

				int position = 0;

				System.out.println("Hello! please insert your name.");

				Scanner userInput = new Scanner(System.in);

				String name = userInput.next();
				System.out.println("How many theoretical turns would you like to go through?");
				int bankAccount= userInput.nextInt();

				System.out.println("Type 'Run' to go through turns.");

				String endGame = userInput.next();

				do

					{

						int diceRoll1 = ((int) ((Math.random() * 6) + 1));

						int diceRoll2 = ((int) ((Math.random() * 6) + 1));

						int diceRoll = diceRoll1 + diceRoll2;

						System.out.println("It is " + name + "'s turn");

						System.out.println(name + " is on " + board[position]);

						if ((position + diceRoll) > 39)

							{

								position = position + diceRoll - 40;

							}

						else

							{

								position += diceRoll;

							}

						System.out.println(name + " rolled a " + diceRoll1 + " and a " + diceRoll2 + ". You landed on "
								+ board[position] + ".");

						if (position == 30)

							{

								position = 10;
								System.out.println();
								System.out.println("You are in Jail.");

								do

									{

										int diceRollJ1 = ((int) ((Math.random() * 5) + 1));

										int diceRollJ2 = ((int) ((Math.random() * 5) + 1));

										System.out
												.println(name + " rolled a " + diceRollJ1 + " and a " + diceRollJ2 + ".");

										if (diceRollJ1 == diceRollJ2)

											{

												position = diceRollJ1 + diceRollJ2 + 10;

												System.out.println("You got out of jail and moved " + (position-10) + " places to " + board[position] + ".");

											}
										
										else

											{

												System.out.println("Sorry, you cannot leave yet.");

											}
										if (turns==2)
											{
												position = diceRollJ1 + diceRollJ2 + 10;
												System.out.println("You must pay $50 to get out.");
												System.out.println("When you pay, you will move " + (position-10) + " places which puts you on " + board[position] + ".");
											}
										turns++;

									} while (position == 10 && turns<3);
								turns=0;
							}

						bankAccount--;

						System.out.println();

					} while (endGame.equals("Run") && bankAccount > 0);

			}

	}