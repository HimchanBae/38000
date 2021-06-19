package Assignment_Day5_Array;

import java.util.Scanner;

public class Quiz4 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("10개의 정수를 입력해 주세요 : "); //입력 받음
		int[] numArray = new int[10]; //배열 선언
		
		int sum = 0; 
		double average = 0.0; //합계와 평균 계산을 위한 변수 선언
		
		for (int i=0; i<10; i++ ) //10개 범위 지정
		{
			numArray[i] = in.nextInt();
			
			if (i%2 == 0) //홀수번째일 경우 (인덱스는 0부터 시작하므로 1번째 자리가 인덱스 0)
			{
				average += numArray[i];
			}
			else //짝수번째일 경우 
			{
				sum += numArray[i];
			}
		}	
		System.out.printf("sum : " + sum + "\navg : " + "%.1f",(average/5));
		in.close();
	}

}
	
