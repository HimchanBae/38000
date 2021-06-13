package Assignment_Day4;

import java.util.Scanner;

public class Quiz6 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("1~100 사이의 숫자를 입력해 주세요 : "); //입력 받음
		int n = in.nextInt();
		
		if ( n <= 0 || n >100 ) //잘못 입력됐을 경우
		{
			System.out.println("올바른 값을 입력해 주세요.");
		}
		else //잘 입력됐을 경우
		{
			for ( int i=1; i<100; i++ ) //배수의 결과가 100보다 작은 수이므로 100 미만으로
			{			
				int k = n*i;
				System.out.print( k + " " ); //배수들 출력
				
				if ( k%10 == 0 ) //10의 배수면 종료
				{
					break;
				}
			}
		}
		in.close();
	}

}