package Assignment_Day3;

import java.util.Scanner;

public class Quiz4 
{

	public static void main(String[] args) 
	{ //입력받기
		Scanner input = new Scanner (System.in);
		int num;
		int count = 0; //개수를 출력해야 하므로 카운트 만들어주기 
		
		do { //0이 될 때까지 입력받는 do-while문 작성 
			
			System.out.print( "정수를 입력해 주세요 : ");
			num = input.nextInt();
			
			if ( num%3 != 0 && num%5 != 0 ) //3의 배수도 아니고 5의 배수도 아닌 수들일 때, 
			{
				count += 1; //카운트를 사용하여 더해줌 
			}
			
		} while ( num != 0 );
		
		System.out.println( count ); //출력해줌 
		
		input.close(); //짜잔 
	}

}
