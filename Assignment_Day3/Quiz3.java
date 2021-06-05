package Assignment_Day3;

import java.util.Scanner;

public class Quiz3 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner ( System.in );
		System.out.print( "자연수 한 개를 입력해 주세요 : " );
		int i = input.nextInt();
		
		for ( int n = 1; n <= 10; n++ )
		{	
			System.out.print( i * n + " " );
		}
		
		input.close();
	}

}
