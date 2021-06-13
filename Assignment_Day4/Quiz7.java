package Assignment_Day4;

import java.util.Scanner;

public class Quiz7 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("자연수를 입력해 주세요 : ");
		int n = in.nextInt();
		
		int a = 1; //숫자가 1부터 시작되므로
		
		for ( int column = 0; column < n; column++ ) //n줄만큼 행을 만들어줌
		{
			for ( int row = 1; row <= n-1-column; row++) //맨 윗줄의 띄어쓰는 횟수는 n-1
			{
				System.out.print("  ");
			}
			for ( int row = 1; row <= column+1; row++ ) //숫자는 줄수에 비례해서 1개씩 늘어남
			{
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
		in.close();
	}

}