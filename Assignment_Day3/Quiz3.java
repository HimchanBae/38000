package Assignment_Day3;

import java.util.Scanner;

public class Quiz3 
{

	public static void main(String[] args) 
	{

		Scanner in = new Scanner ( System.in ) ;
		System.out.print( "한 개의 자연수를 입력해 주세요 : " );
		int i = in.nextInt();
		int n = 1;
		
		while ( n <= 10 )
		{	System.out.print( i * n + " " );
		 	n++;
		}
		
		in.close();
	}

}