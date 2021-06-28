package Array_String_Exercise;

import java.util.Scanner;

public class Quiz8 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.println("첫 번째 문자열을 입력해 주세요 : ");
		String str1 = in.next();
		System.out.println("두 번째 문자열을 입력해 주세요 : ");
		String str2 = in.next();
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		char[] word1 = str1.toCharArray();
		char[] word2 = str2.toCharArray();
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		for (int i = 0; i < len1; i++) 
		{
			if ( word1[i] >= '0' && word1[i] <= '9' ) 
			{
				cnt1++;
			}
			else
			{
				break;
			}
		}
		
		for (int i = 0; i < len2; i++) 
		{
			if ( word2[i] >= '0' && word2[i] <= '9' ) 
			{
				cnt2++;
			}
			else
			{
				break;
			}
		}
		
		for (int i = 0; i < cnt1; i++) 
		{
			System.out.print(word1[i]);
		}
		for (int i = 0; i < cnt2; i++) 
		{
			System.out.print(word2[i]);
		}
		
		in.close();
	}
}
