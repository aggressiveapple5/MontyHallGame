/**
* This program allows the user to play
* the Monty Hall Game to examine the odds
* if the user switches or stays.
* @author Matt Keller
* @version 1.0
*/

import java.util.Scanner;

public class MontyHallGame
{

	public static void main(String[] args)
	{
	
		// game description
		init();
	
		// game
		game();
	
	
	
	
	
	}




	public static void init()
	{
		
		System.out.println("Welcome to Monty Hall Game");
		System.out.println("There is a car hidden in one of the three doors");
		System.out.println("Pick a door now and you will have a chance to switch");
		System.out.println("later.");

	}


	public static void game()
	{
	
		// creating an instance of a Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// the door the car is in
		int car = (int) (Math.random() * 3 + 1);
		
		// testing
		System.out.println("car = " + car);
	
		System.out.print("Please pick a door (1, 2, 3): ");
		int userPick = keyboard.nextInt();
		// get rid of the new line from the buffer
		keyboard.nextLine();
	
	
		// testing
		System.out.println("userPick = " + userPick);
		
		int reveal = doorToReveal(car, userPick);
		System.out.println("Door number " + reveal + " is empty.");
		System.out.println("Do you want to switch (yes or no): ");
		String answer = keyboard.nextLine();
		
		if(answer.equals("yes"))
		{
		
			for(int x = 1; x <= 3; x++)
			{
				if((x != userPick) && (x != reveal))
					userPick = x;
				
			}
		
			
		
		
		}
		
		System.out.println("Your new door is " + userPick);
		if(userPick == car)
		{
			System.out.println("Congratulations! You win a car!");
		}
		else
		{			
			System.out.println("Sorry. You don't win anything.");
		}
		
	}



	/**
	* This method returns the doo number that is
	* neither the car is in or the user's pick.
	* @param c the door number that the car is in
	* @param u the door number that the user picked
	* @return int
	*/

	public static int doorToReveal(int c, int u)
	{
	
	
		for(int x = 1; x <= 3; x++)
		{
			if((x != u) && (x != c))
			{
				return x;
			}
			
		}
	
		return -1;
	
	
	
	
	}



}