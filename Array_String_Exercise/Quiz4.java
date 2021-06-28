package Array_String_Exercise;

import java.util.Scanner;

public class Quiz4 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int[] ary = new int[100];
		
		int cnt = 0;
		
		for (int i = 0; i < ary.length; i++) 
		{
			ary[i] = in.nextInt();
			
			if (ary[i] == 0) break;
			
			cnt ++;
		}
		System.out.println( cnt );
		
		for (int i = 0; i < ary.length; i++) 
		{
			if (ary[i] == 0) 
			{
				break;
			}
			else if (ary[i]%2 == 0) 
			{
				ary[i] = ary[i] / 2;
			}
			else if (ary[i]%2 != 0) 
			{
				ary[i] = ary[i] * 2;
			}
			System.out.print(ary[i] + " ");
		}
		in.close();
	}

}
