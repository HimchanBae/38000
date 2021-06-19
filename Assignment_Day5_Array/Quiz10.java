package Assignment_Day5_Array;

import java.util.Scanner;

public class Quiz10 
{

	public static void main(String[] args) 
	{
		int[][] arr = new int [4][2]; //4행 2열
		
		Scanner in = new Scanner (System.in);
		
		int result = 0; //전체 평균을 위해

		for (int i = 0; i < 4; i++) //4행 2열 입력 받음
		{
			for (int j = 0; j < 2; j++) 
			{
				arr[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < 4; i++) //열 평균 합계를 위해
		{
			int sum = 0;

			for (int j = 0; j < 2; j++) 
			{
				sum += arr[i][j];
			}
			result += sum;
			System.out.print((sum / 2) + " ");
		}
		System.out.println();

		for (int i = 0; i < 2; i++) //행 평균 합계를 위해 2행 4열로 바꿔줌
		{
			int sum = 0;

			for (int j = 0; j < 4; j++) 
			{
				sum += arr[j][i];
			}
			System.out.print((sum / 4) + " ");
		}
		System.out.println();

		System.out.println(result / 8); //전체 평균
		in.close();
	}

}
