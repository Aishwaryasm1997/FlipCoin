package day_5_assignments;

import java.util.Scanner;

public class Flip_Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int headcount = 0, tailcount = 0;
		double headpercentage, tailpercentage;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of times  flip the coin");
		int a = sc.nextInt();

		for (int j = 0; j < a; j++) {
			double random = Math.random();
			if (random < 0.5)
				tailcount++;
			else
				headcount++;
		}

		headpercentage = headcount / (double) a * 100;
		tailpercentage = tailcount / (double) a * 100;
		System.out.println("Percentage of heads-" + headpercentage + "%");
		System.out.println("Percentage of tails-" + tailpercentage + "%");
	}

}
