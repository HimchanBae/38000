package Array_String_Exercise;

import java.util.Scanner;

public class Quiz3 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("세자리 이하의 정수를 입력해 주세요 : ");
		int[] ary = new int[100];
		int max = 0; int min = 0;
		
		for (int i = 0; i<100; i++) 
		{
			ary [i] = in.nextInt();
			if (ary [i] > 999) 
			{
				System.out.println("error");
				break;
			}
			else if (ary[i] < 999)
			{
				max = Math.max(max, ary[i]);
				min = Math.min(min, ary[i]);
			}
			else if (ary[i]==999) 
			{
				break;
			}
		}
		System.out.println( "max : " + max + "\nmin : " + min);
		in.close();
	}

}
