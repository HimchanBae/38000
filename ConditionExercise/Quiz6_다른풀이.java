package Assignment_Day3;

import java.util.Scanner;

public class Quiz6_다른풀이 
{

	public static void main(String[] args) 
	{
		char answer;
		
		do	
		{
			Scanner input = new Scanner ( System.in );
			System.out.print("Base = ");
			double base = input.nextDouble();
			
			Scanner input2 = new Scanner ( System.in );
			System.out.print("Height = ");
			double height = input2.nextDouble();
			
			double width = ( base * height ) / 2;
					
			System.out.printf("Triangle width = " + "%.1f" , width );
			
			Scanner input3 = new Scanner ( System.in );
			System.out.print("\nContinue? ");
			answer = input3.next().charAt(0);
		
		} while (( answer == 'y' ) || ( answer == 'Y' ));
		
	}

}
