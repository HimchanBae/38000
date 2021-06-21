package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz5 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("길이 100 이하의 문자열을 입력해 주세요 : ");
		String word = in.next();
	
		char[] letters = word.toCharArray(); //String 을 CharArray 로
		int len = letters.length;
		
		if (len>100) //100자 이하로 입력
		{
			System.out.println("올바른 길이로 입력해 주세요.");
		}
		else 
		{
			for (int i=0; i<len; i++) //행
			{
				for (int j=0; j<len; j++) //열
				{
					int answer = (j+(len-1)*(i+1))%len;	//규칙
					System.out.print(letters[answer]);
				}
				System.out.println();
			}
		}
		in.close();		
	}

}
