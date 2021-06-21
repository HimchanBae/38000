package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz12
{

	public static void main(String[] args) 
	{//20자 이하 문자열 두 개 입력 -> 첫 번째 앞부분 두자 치환 나머지 + concat 앞부분 두자 다시 붙이기
		Scanner in = new Scanner (System.in);
		System.out.print("두 개의 문자열을 입력해 주세요. : ");
		String str = in.nextLine();
		String[] word = str.split(" "); //나눠서 저장
		
		if (word[0].length() > 20 || word[1].length() >20)
		{
			System.out.println("20개 이하의 문자를 입력하세요.");
		}
		else 
		{
			String front = word[0].substring(0,2); //두글자 추출
			String middle = word[1].substring(2,word[1].length()); //뒷글자 추출
			
			System.out.println(front.concat(middle)+front); //붙임
		}
		in.close();		
	}

}
