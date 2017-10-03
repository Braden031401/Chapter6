package exercises;

import java.util.Scanner;

public class TestScoresStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);
		
		int score = 0;
		int high = 0;
		if(score >= high)
			high = score;
		int low = 0;
		if(score <= low)
			low = score;
		int quit = 999;
		System.out.println("Enter next quiz score or "+ quit  +" to quit");
		score = input.nextInt();
	
	System.out.print("The scores entered were: ");
	int count = 0;
	String[] scores = null;
	for(int x = 0; x < count; ++x)
		System.out.println(scores[x] + " ");
	int total = 0;
	if(count != 0)
		System.out.println("\n The average is "+ (total * 1)/count);
	else
		System.out.println("No scores entered");
	
	}

}
