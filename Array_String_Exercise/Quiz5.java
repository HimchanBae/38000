package Array_String_Exercise;

import java.util.Scanner;

public class Quiz5 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("20이하의 정수 n을 입력하세요 : ");
		int input = in.nextInt();
		int[] arr = new int[input];

		System.out.print("n명의 점수를 입력하세요 : ");
		
		for (int i = 0; i < input; i++) 
		{
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < input - 1; i++) 
		{
			for (int j = i + 1; j < input; j++) 
			{
				if (arr[i] < arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < input; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		in.close();
	}
}