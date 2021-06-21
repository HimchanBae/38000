package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz10 
{

	public static void main(String[] args) 
	{ //공백을 포함한 문장을 입력 받아 홀수 번째 단어만 출력 split, i = 0 2 4 6 ... 출력
		Scanner in = new Scanner (System.in);
		System.out.print("문장을 입력해 주세요 : ");
		String text = in.nextLine(); //중요!! nextLine을 써야함...
		int len = text.length();
		String[] words = text.split(" ");
		
		for(int i=0 ; i < words.length; i++) 
		{
			if(len > 100)
			{
				System.out.println("100자 이하로 입력해 주세요.");
				break;
			}
			else if(i%2 == 0) 
			{
				System.out.println(words[i]);
			}
		}
		in.close();
	}

}
