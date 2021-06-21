package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz6 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("5개 이상 100개 이하의 문자로 된 단어를 입력해 주세요 : ");
		String str = in.next();
		int len = str.length();
		
		if (len < 5 || len > 100) 
		{
			System.out.println("길이를 올바르게 입력해 주세요.");
		}
		else
		{
			System.out.println(str.substring(0, 5););
		}
		in.close();
	}

}
