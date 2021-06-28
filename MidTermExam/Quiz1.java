package MidTermExam;

import java.util.Scanner;

public class Quiz1 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.print("5개의 숫자를 입력해 주세요 : ");
		int[] ary = new int[5];
		int cnt = 0;
		
		for (int i = 0; i < 5; i++) 
		{
			ary[i] = in.nextInt();
			for (int j = 0; j < i; j++) 
			{
				if (ary[i] == ary[j]) 
				{
					cnt ++;
				}
			}
		}
		
		if (cnt > 0)
		{
			System.out.println("중복된 숫자가 있습니다.");
		}
		else
		{
			System.out.println("중복된 숫자가 없습니다.");
		}
		in.close();
	}

}
