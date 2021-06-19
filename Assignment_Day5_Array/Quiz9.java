package Assignment_Day5_Array;

import java.util.Scanner;

public class Quiz9 
{

	public static void main(String[] args) 
	{
		int[][] student = new int[4][3]; //4개 반의 3명의 대표 = 4행 3열의 배열
		
		Scanner in = new Scanner (System.in);

		for (int i = 0; i < 4; i++) //4행
		{
			System.out.print((i + 1) + "class? "); //1반은 0번 인덱스에 있으므로 i+1
			for (int j = 0; j < 3; j++) //3열
			{
				student[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < 4; i++) //4행
		{
			int sum = 0; //합계를 구해줘야 하므로

			System.out.print((i + 1) + "class : ");
			for (int j = 0; j < 3; j++) 
			{
				sum += student[i][j];
			}
			System.out.println(sum);
		}
		in.close();
	}

}
