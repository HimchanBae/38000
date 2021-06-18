package Assignment_Day4;

import java.util.Scanner;

public class Quiz8 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("자연수를 입력해 주세요 : ");
		int n = in.nextInt();
		
		int a = 1; //숫자가 1부터 시작되므로
		
		for ( int row = 0; row < n; row++ ) //n줄만큼 행을 만들어 줌
		{
			for ( int column = 1; column <= row; column++ ) //띄어쓰기는 줄수에 비례해서 1개씩 늘어남
			{
				System.out.print("  ");
			}
			for ( int column = 1; column <= n-row ; column++ ) //숫자는 맨 윗줄이 n번만큼 나오고 줄 수만큼 줄어듬
			{
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
		in.close();
	}

}