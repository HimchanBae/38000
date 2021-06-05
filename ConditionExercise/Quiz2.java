package ConditionExercise;

import java.util.Scanner;

public class Quiz2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner ( System.in ) ;
		System.out.print("영문 대문자 A~F를 입력하시오 : ");
		char name = input.next().charAt(0);
		
		switch(name)
		{	
			case 'A' :
				System.out.println("Excellent");
				break;
			case 'B' :
				System.out.println("Good");
				break;
			case 'C' :
				System.out.println("Usually");
				break;
			case 'D' :
				System.out.println("Effort");
				break;
			case 'F' :
				System.out.println("Failure");
				break;
			default :
				System.out.println("error");
				break;	
		}
		
		input.close();

	}

}
