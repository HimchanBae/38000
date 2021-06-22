package Assignment_Day3;

import java.util.Scanner;

public class Quiz6_다른풀이 
{

	public static void main(String[] args) 
	{
		char answer;
		Scanner input = new Scanner ( System.in );
		
		do	
		{
			System.out.print("Base = ");
			double base = input.nextDouble();
			
			System.out.print("Height = ");
			double height = input.nextDouble();
			
			double width = ( base * height ) / 2;
			System.out.printf("Triangle width = " + "%.1f" , width );
			
			System.out.print("\nContinue? ");
			answer = input.next().charAt(0);
		
		} while (( answer == 'y' ) || ( answer == 'Y' ));
		
	}

}
