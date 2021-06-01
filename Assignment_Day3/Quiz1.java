package Assignment_Day3;

import java.util.Scanner;

public class Quiz1 
{

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner ( System.in ) ;
		System.out.print( "100 이하의 양의 정수를 입력해 주세요 : " );
		int i = in.nextInt();
		int n = 1;
		int sum = 0;
		
		while ( n <= i)
		{	sum += n ;
		 	n++;
		}
		
		System.out.print( sum );
		
		in.close();
		
	}

}
