package ConditionExercise;

import java.util.Scanner;

public class Quiz4 
{

	public static void main(String[] args) 
	{	//연도를 먼저 입력 받음 
		Scanner input = new Scanner(System.in);
		System.out.print("연도를 입력해 주세요 : ");
		int year = input.nextInt();
			//윤년 평년 판단 
		if (( year%400 == 0 ) || ( year%4 == 0 && year%100 != 0 ))
		{
			System.out.print( "윤년입니다. 프로그램이 종료됩니다." );	
		}
		else	//평년일 경우에 월을 입력 받음
		{
			System.out.print( "월을 입력해 주세요(1~12) : " );
			Scanner input2 = new Scanner(System.in);
		
			int month = input2.nextInt();				
				switch ( month )	//월별로 일수를 출력해 줌  
				{	
					case 1 :
					case 3 :
					case 5 :
					case 7 :
					case 8 :
					case 10 :
					case 12 :
						System.out.println( "31" );
						break;
					case 2 :
						System.out.println( "28" );
						break;
					case 4 :
					case 6 :
					case 9 :
					case 11 :
						System.out.println( "30" );
						break;
					default :
						System.out.println( "error" );
						break;
				}
			
			input2.close();
			
		}
		
		input.close();
		
	}
}
