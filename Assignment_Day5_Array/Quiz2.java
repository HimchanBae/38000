package Assignment_Day5_Array;

import java.util.Scanner;

public class Quiz2
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("6명의 몸무게를 입력해 주세요 : "); //6명의 몸무게를 입력 받음
		double[] weight = new double[6]; //배열 선언
		
		double sum = 0, average = 0; //합계와 평균을 계산해주기 위한 변수를 선언
		
		for (int i = 0; i < 6; i++) //6명 까지 한 명씩 
		{
			weight[i] = in.nextDouble();
			sum += weight[i]; //처음부터 한 명씩 더해주면서 반복
		}
		
		average = sum/6; //합계를 6명으로 나누면 평균
		System.out.printf("%.1f",average); //평균을 소수 첫째자리까지 반올림하여 출력
		
		in.close();
	}

}
