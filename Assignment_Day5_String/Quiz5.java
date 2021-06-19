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
		int n = letters.length;
				
		for (int k=0; k<n; k++) 
		{
			for (int i=0; i<n; i++) 
			{
				int j = (i+(n-1)*(k+1))%n;	
				System.out.print(letters[j]);
			}
			System.out.println();
		}
		in.close();		
	}

}
