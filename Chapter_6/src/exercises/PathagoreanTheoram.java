package exercises;

import java.util.Scanner;

public class PathagoreanTheoram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double Side1;
		double Side2;
		double Hypotenuse;
		double X;
		double Area;
		double Perimeter;
		int Continue = 0;
		String EXIT = null;
		String No = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("If the side is missing type a 0 for the length");
		
		
		
			while(Continue <= 1 )
		{
		System.out.println("What is the length of Side 1?");
		Side1 = input.nextDouble();
		
		System.out.println("What is the length of Side 2?");
		Side2 = input.nextDouble();
		
		System.out.println("What is the length of the Hypotenuse?");
		Hypotenuse = input.nextDouble();
		
		
		if(Side1 == 0)
		{
			X = Hypotenuse*Hypotenuse - Side2*Side2;
			Side1 = Math.sqrt(X);
			System.out.println("The length of Side 1 is "+ Side1);
			
		}
		if(Side2 == 0)
		{
			X = Hypotenuse*Hypotenuse - Side1*Side1;
			Side2 = Math.sqrt(X);
			System.out.println("The length of Side 2 is "+ Side2);
		}
		if(Hypotenuse == 0)
		{
			X = Side2*Side2 + Side1*Side1;
			Hypotenuse = Math.sqrt(X);
			System.out.println("The length of the Hypotenuse is "+ Hypotenuse);
		
		}
		Area = Hypotenuse*Side1*Side2;
		System.out.println("The Area is "+ Area);
		Perimeter = Hypotenuse+Side1+Side2;
		System.out.println("And the Perimeter is "+ Perimeter);
		
		System.out.println("Do you wish to exit? Type 2 to Exit, Type 1 to continue");
		Continue = scan.nextInt();
		
	
		
	}
	}
}
