package Assignment_Day5_String;

import java.util.Scanner;

public class Quiz11 
{

	public static void main(String[] args) 
	{//20개 이하의 문자로 이루어진 10개 단어 입력 + 한개의 문자 입력 = 마지막 문자로 끝나는 모든 단어 출력
		Scanner in = new Scanner (System.in);
		System.out.print("20개 이하 문자의 10개 단어를 입력해 주세요 : ");
		String[] str = new String[10];	//입력 받은 10개 단어를 저장할 어레이

		for( int i=0; i<10; i++ ) //입력 받은 10개 단어 저장
		{
			str[i] = in.nextLine();
			int len = str[i].length();
			if ( len > 20 ) //20개 이하의 문자
			{
				System.out.println("20개 이하의 문자를 입력해 주세요.");
				break;
			}
		}
		System.out.print("한 개의 문자를 입력해 주세요 : ");
		String last = in.next(); //endsWith을 위해 스트링으로 받음
		int len = last.length();
		
		if (len == 1) //한 개의 문자일 경우에만
		{
			
			for ( int i=0; i<10; i++ ) 
			{
				if (str[i].endsWith(last)) //마지막에 입력받은 문자로 끝나는 단어일 경우에만 프린트
				{
					System.out.println( str[i] );
				}
			}
		}
		else
		{
			System.out.println("한 개의 문자만 입력해 주세요.");
		}
		in.close();
	}

}
