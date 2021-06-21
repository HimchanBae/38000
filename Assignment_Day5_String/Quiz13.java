package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz13 
{

	public static void main(String[] args) 
	{//공백을 포함한 문자열 입력 -> 각 단어로 분리(split) -> 입력 순서의 반대로
		Scanner in = new Scanner (System.in);
		System.out.print("문자열을 입력해 주세요 : "); //입력 받음
		String str = in.nextLine();
		
		String[] words = str.split(" "); //나눠줌
		
		int len = str.length(); //100자 이하로 받기 위하여
		
		if ( len < 100 )
		{
			for (int i = words.length-1; i >= 0; i--) //반대로 출력
			{
				System.out.println( words[i] );
			}
		}
		in.close();
	}

}
