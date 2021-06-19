package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz8 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("첫 번째 단어를 입력해 주세요 : ");
		String word1 = in.next();
		System.out.print("두 번째 단어를 입력해 주세요 : ");
		String word2 = in.next();
		
		int len1 = word1.length();
		int len2 = word2.length();
		
		if ( len1 > 100 || len2 > 100 )
		{
			System.out.println("100자 이하의 단어를 입력해 주세요.");
		}
		else if ( len1 > len2 ) 
		{
			System.out.println(len1);
		}
		else if ( len1 < len2 ) 
		{
			System.out.println(len2);
		}
		else
		{
			System.out.println("두 단어의 길이가 같습니다.");
		}
		in.close();
	}

}
