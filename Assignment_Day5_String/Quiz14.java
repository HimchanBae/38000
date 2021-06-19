package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz14 
{

	public static void main(String[] args) 
	{//두 개의 문자열과 한 개의 정수 입력 -> AB연결 (concat) -> A의 n개의 문자를 B에 복사 후 출력 (substring)
		Scanner in = new Scanner (System.in);
		System.out.print("두 개의 문자열과 한 개의 정수를 입력해 주세요 : ");	//동시에 다 입력 받음 
		String str = in.nextLine();
		String[] words = str.split(" ");	//쪼개줌
		
		String word1 = words[0];	//첫 번째 단어
		String word2 = words[1];	//두 번째 단어
		String word3 = words[2];	//세 번째 정수
		int number = Integer.parseInt(word3); //정수로 변환
		int len = word2.length(); //substring을 위해
		
		String front = word1.substring(0,number);	//앞부분
		String middle = word2.substring(number,len);	//뒷부분
		
		String mix1 = word1.concat(word2);	//붙여줌
		String mix2 = front.concat(middle);	//붙여줌
		
		System.out.println( mix1 + "\n" + mix2 ); //개행해서 출력
		
		in.close();
	}

}
