package Assignment_Day5_Array;

import java.util.Scanner;

public class Quiz1 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("10개의 문자를 입력해 주세요 : "); //문자를 10개 입력 받음
		char[] number = new char[10]; //배열 선언
		
		for (int i = 0; i < 10; i++) //10개 까지 한 개씩 
		{
			number[i] = in.next().charAt(0);
		}
		System.out.print( number[0]+ " " + number[3] + " " + number[6] ); //1,4,7번째만 출력
		in.close();
	}

}
