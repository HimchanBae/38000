package ConditionExercise;

import java.util.Scanner;

public class Quiz1 
{
	
	public static void main(String[] args) 
	
	{

		//사용자에게 필요한 정보를 입력 받음(정수) 
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int n = input.nextInt();
		
		// 양수, 0, 음수 판단 조건문 작성
		if ( n  > 0 )
		{ 
			System.out.println( "plus" );
		} 
		else if ( n == 0 )
		{ 
			System.out.println( "zero" );	
		}
		else
		{
			System.out.println( "minus");
		}
		
		
		input.close();
		
	}

}
