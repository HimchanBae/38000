package Array_String_Exercise;

import java.util.Scanner;

public class Quiz6 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("행의 크기를 입력해 주세요 : ");
		int num = in.nextInt();
		
		int[][] ary = new int [num][num];
		
		for (int i = 0; i < num; i++) 
		{
			for (int j = 0; j < i+1; j++) 
			{
				if (j == 0) 
				{
					ary[i][j] = 1;
				}
				else if (j > 0)
				{
					ary[i][j] = ary[i-1][j-1] + ary[i-1][j];
				}
			}
		}
		
		for (int i = num-1; i >= 0; i--) 
		{
			for (int j = 0; j < i+1; j++) 
			{
				if (ary[i][j] != 0) 
				{
					System.out.print(ary[i][j] + " ");
				}
			}
			System.out.println();
		}
		in.close();
	}

}
