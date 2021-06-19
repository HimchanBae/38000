package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz4 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("첫 번째 문자열을 입력해 주세요 : ");
		String str1 = in.next();
		int len1 = str1.length();
		
		System.out.print("두 번째 문자열을 입력해 주세요 : ");
		String str2 = in.next();
		int len2 = str2.length();
		
		if (len1 >= 20 || len2 >= 20)
		{
			System.out.println("20자 미만의 문자열을 입력해 주세요.");
		}
		else
		{
			System.out.println( len1 + len2 );
		}
		in.close();
	}

}
