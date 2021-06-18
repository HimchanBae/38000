package Assignment_Day4;

import java.util.Scanner;

public class Quiz3 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("행과 열의 숫자를 각각 입력해 주세요 : ");
		int x = in.nextInt(), y = in.nextInt(); //입력 받기
	
		for ( int row = 1; row <= x; row++ ) //행이 될 식
		{
			for ( int column = 1; column <= y; column++ ) //열이 될 식
			{
				System.out.print( row * column + " " ); //출력
			}
			System.out.println(); //개행
		}
		in.close();
	}

}
