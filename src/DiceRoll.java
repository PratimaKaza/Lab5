/*****@author pratimakaza******/
/*********Lab 5: Roll Dice *******/
/***import java.util.Random; ***/ // for the java random but didn't work out
import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int diceSides = 0;

		// 1.ask user for number of sides pair of dice
		
		System.out.println("Please enter the number of sides on the pair of dice.");
		diceSides = scan.nextInt();
		System.out.println(diceSides);

		// 2.ask user to roll dice
		
		scan.nextLine();
		System.out.println("Please press 'y' when ready to roll the dice.");
		String rollDice = scan.nextLine();
		System.out.println(rollDice);

		// 3.roll two dice
		
		System.out.println(genRand(diceSides));
		// for (int i = 0; i < 100; i++) {         // for verifying if the random formula is truly random when rolled twice.
		System.out.println("One roll of dice resulted in: " + genRand(diceSides) + "  Second roll of dice resulted in: "
				+ genRand(diceSides));
		// }



		// int var = ((int) (Math.random() * 5));          //while attempting to call java random method
		// System.out.println(var);
		
		// 5.experiment with diff random generators

		// genRand(5);                                    //while attempting to call the java random method
		// System.out.println(genRand);

		scan.close();

	}
	// 4.generate random numbers using methods
	
	public static int genRand(int var) {

		// return ((int) Math.round((Math.random()) * (var + 1)));

		// for (int i = 0; i < 100; i++) { // for verifying if the random formula is
		// truly random

		return ((int) (((Math.random()) * var) + 1));
		// }

	}

	// public static int genRand(int nextRan) { // tried the java random for and
	// hour and a half and gave up
	// Random dom = new Random();
	// dom.nextInt();
	// System.out.println(dom);
	// return dom;
	// }

	// private static double random() {
	//
	// return 0;
	// }
}
