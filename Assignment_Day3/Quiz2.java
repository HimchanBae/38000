package Assignment_Day3;

import java.util.Scanner;

public class Quiz2 
{

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner ( System.in ) ;
		System.out.print( "100 이하의 정수를 입력해 주세요 : " );
		int i = in.nextInt();
		int sum = 0;
		
		while ( i <= 100 )
		{	
			sum += i ;
		 	i++;
		}
		
		System.out.print( sum );
		in.close();
		
	}

}
