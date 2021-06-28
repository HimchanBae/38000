package Array_String_Exercise;

import java.util.Scanner;

public class Quiz9 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("세 개의 단어를 입력해 주세요 : ");
		String[] ary = new String[3];
		
		for (int i = 0; i < ary.length; i++) //입력 받은 단어를 어레이에 저장
		{
			ary[i] = in.next();
		}
		
		String temp; //비교하기 위한 빈통
		
		for (int i = 0; i < 2; i++) //인덱스 0,1을
		{
			for (int j = i + 1; j < 3; j++) //인덱스 1,2와 비교
			{
				if (ary[i].compareTo(ary[j]) > 0) //비교된 대상이 더 작으면(먼저 오는 알파벳이면) 앞으로(여기서는 인덱스0) 치환 시켜줌
				{
					temp = ary[i]; 

					ary[i] = ary[j];

					ary[j] = temp;
				}
			}
		}
		System.out.println(ary[0]);
		in.close();
	}

}
