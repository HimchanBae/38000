package Assignment_Day5_Array;

import java.util.Scanner;

public class Quiz8 
{

	public static void main(String[] args) 
	{
		int[][] arr1 = new int[2][4]; //2행 4열의 배열 첫 번째
		int[][] arr2 = new int[2][4]; //2행 4열의 배열 두 번째
		int[][] arr3 = new int[2][4]; //두 배열의 곱을 나타낼 배열

		Scanner in = new Scanner(System.in);

		System.out.println("first array");
		for (int i = 0; i < 2; i++) //2행
		{
			for (int j = 0; j < 4; j++) //4열
			{
				arr1[i][j] = in.nextInt();
			}
		}

		System.out.println("second array");
		for (int i = 0; i < 2; i++) //2행
		{
			for (int j = 0; j < 4; j++) //4열
			{
				arr2[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < 2; i++) //2행
		{
			for (int j = 0; j < 4; j++) //4열
			{
				arr3[i][j] = arr1[i][j] * arr2[i][j];
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
	}

}
