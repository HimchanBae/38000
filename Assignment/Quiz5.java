package Assignment;

import java.util.Scanner;

public class Quiz5 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print( "yard? " );
		double x = input.nextDouble();
		double y = x * 91.44;
		double remain = ( y - (int)y ) * 10;
		int z = (int)( 0.5 + remain );
		
		System.out.print( x + "yard = " + (int) y + "." + z + "cm" );
		
	}

}
