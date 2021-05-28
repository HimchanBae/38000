package ConditionExercise;

import java.util.Scanner;

public class Quiz6
{

	public static void main(String[] args) 
	{
		
		//년도를 입력 받음 
		Scanner input = new Scanner(System.in);
		System.out.print("연도를 입력해 주세요 : ");
		
		int year = input.nextInt();
		
		//윤년 평년 판단 
		if (( year%400 == 0 ) || ( year%4 == 0 && year%100 != 0 ))
		{
		System.out.print( "leap year" );
		}
		
		else
		{
		System.out.print( "common year" );	
		}
		
		input.close();
		
	}	
	
}	