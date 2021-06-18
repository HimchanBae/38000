package Assignment_Day4;

import java.util.Scanner;

public class Quiz1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner ( System.in );
		System.out.print( "자연수를 입력해 주세요 : ");
		int n = input.nextInt();
		int sum = 0, count = 0; //합계와 더해진 횟수 계산에 필요한 변수 선언
		
		for ( int i=1; ; i+=2 ) //일단은 i 범위 제한 없이 반복, 홀수는 2씩 더해준 값을 누적으로 더하는 것
		{			
			if ( sum >= n ) //합계가 입력값보다 커지면 프로그램이 끝날 수 있게 
			{
				break;
			}
			sum += i; //홀수들의 합
			count++; //더해질 때마다 카운트
		} 
		System.out.print(count + " " + sum);
		input.close();
	}
}