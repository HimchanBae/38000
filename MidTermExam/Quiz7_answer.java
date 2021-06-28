package MidTermExam;

import java.util.Scanner;

public class Quiz7_answer 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int n = in.nextInt();
		for (int i=1; i<=n; i++)
		{
			char ch = (char)('A' + (i-1)); //몰랐던 아이디어 1.
			
			for ( int j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}
			
			for ( int j = 1; j <= i; j++ ) //규칙은 i + (n-1) + (n-2) ... +=n-j 숫자만 문자로 변환하면 댐
			{	
				System.out.print(ch); //몰랐던 아이디어 2.
				ch += (char)n-j;
			}
			System.out.println();
		}
		in.close();
		
	}

}
