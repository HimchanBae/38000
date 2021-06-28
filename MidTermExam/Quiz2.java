package MidTermExam;

import java.util.Scanner;

public class Quiz2 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		
		System.out.print("입력 배열1: ");
		int[] ary1 = new int[7];
		int cnt1 = 0;
		int cnt2 = 0;
		
		for (int i=0; i<7; i++) 
		{
			ary1[i] = in.nextInt();
			for (int j = 0; j < i; j++) 
			{
				if (ary1[i] == ary1[j]) 
				{
					cnt1 ++;
				}
			}
		}
		
		System.out.print("입력 배열2: ");
		int[] ary2 = new int[7];
		
		for (int i=0; i<7; i++) 
		{
			ary2[i] = in.nextInt();
			for (int j = 0; j < i; j++) 
			{
				if (ary2[i] == ary2[j]) 
				{
					cnt2 ++;
				}
			}
		}
		
		int sum = cnt1 + cnt2;
		int count = 0;
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j < 7; j++) 
			{
				if (ary1[i] == ary2[j]) 
				{
					count ++;
				}
			}
		}
		
		System.out.println("일치하는 숫자의 개수:" + (count - sum));
		
		in.close();
	}

}
