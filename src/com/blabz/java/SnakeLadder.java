package com.blabz.java;

import java.util.Random;

public class SnakeLadder {
	public static void main(String[] args) {
		int start = 0;
		System.out.println("Starting position of player is : " + start);

		Random random = new Random(); // random is a container to store the all the random values
		int dice = random.nextInt(6) + 1; // here the (6+1) is the generating the random value is between the 0 to 6
		System.out.println("Enter the number: " + dice);

	}

}
