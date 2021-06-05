package ConditionExercise;

import java.util.Scanner;

public class Quiz3 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner (System.in);
		System.out.print( "Number? (1 or 2 or 3): " );
		int animal = input.nextInt();
		
		if ( animal == 1 )
		{ 
			System.out.println("dog");
		}
		else if ( animal == 2 )
		{ 
			System.out.println("cat");
		}
		else if ( animal == 3 )
		{ 
			System.out.println("chick");
		}
		else
		{ 
			System.out.println("I don't know.");
		}

		input.close();
	}

}
