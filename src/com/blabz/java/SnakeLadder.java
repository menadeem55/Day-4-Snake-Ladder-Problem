package com.blabz.java;

import java.util.Random;

public class SnakeLadder {
	public static void main(String[] args) {
		int start = 0;
		int count = 0;
		int userPosition = 0;
		System.out.println("Starting position of player is : " + start);

		Random random = new Random(); // random is a container to store the all the random values
		int dice = random.nextInt(6) + 1; // here the (6+1) is the generating the random value is between the 0 to 6
		System.out.println("Dice result number : " + dice);

		while (userPosition != 100) {
			count++;

			int cases = random.nextInt(3);
			switch (cases) {
			case 0:
				System.out.println("No Play!!");
				break;
			case 1:
				System.out.println("Ladder!");
				userPosition = userPosition + dice;
				if (userPosition > 100) {
					userPosition = dice;
				}
				break;
			default:
				System.out.println("Snake!!");
				userPosition = userPosition - dice;
			}
			if (userPosition < 0) {
				userPosition = 0;
			}

			System.out.println("Presnt Position of the User: " + userPosition);
			System.out.println("Present Position of the User: " + userPosition);

		}
		System.out.println("User has rolled " + count + " times to win!");

	}
}
