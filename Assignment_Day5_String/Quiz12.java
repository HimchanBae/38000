package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz12
{

	public static void main(String[] args) 
	{//20자 이하 문자열 두 개 입력 -> 첫 번째 앞부분 두자 치환 나머지 + concat 앞부분 두자 다시 붙이기
		Scanner in = new Scanner (System.in);
		System.out.print("20자 이하의 문자열 두 개를 입력해주세요 : "); //문자열 입력 받음
		String str = in.nextLine();
		String[] ary = str.split(" "); //스플릿으로 나눠 줌
		
		String word1 = ary[0]; //각각 따로 저장
		String word2 = ary[1];
		
		int len = word2.length(); //substring 위해서; word2는 몇 글자일지 알 수 없으므로
		
		String first = word1.substring(0,2);
		String middle = word2.substring(2,len);
		
		String answer = first.concat(middle).concat(first); //concat으로 붙여줌
		
		System.out.println( answer );
		
		in.close();
	}

}
