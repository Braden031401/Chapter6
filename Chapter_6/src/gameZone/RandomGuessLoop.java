package gameZone;

import javax.swing.JOptionPane;

public class RandomGuessLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	
		int guess;
		int result;
		String resultString;
		String msg = null;
		int low = 1;
		int high = 500;
		int score = 11;
		result = low + (int)(Math.random() * high);
		
		do {
			
		resultString = JOptionPane.showInputDialog(null, "Try to guess a number between "+ low +" and "+ high);
		guess = Integer.parseInt(resultString);
		score = score -1;
		if(guess==result)
		{
			msg="You Win!! ";
		}
			if (guess<result)
		{
			msg="Your guess was too low ";
		
		}
			if (guess>result)
				
					msg="Your guess was too high ";
		
					JOptionPane.showMessageDialog(null, msg + "Your Score is "+ score);
				
	}while(guess != result && score !=0);
	
		
			JOptionPane.showMessageDialog(null, "The Number Was "+ result);

}
}
