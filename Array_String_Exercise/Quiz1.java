package Array_String_Exercise;

import java.util.Scanner;

public class Quiz1 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("자연수 두 개를 입력해 주세요 : ");
		int num1 = in.nextInt(), num2 = in.nextInt();
		
		int[] ary = new int[10];
		ary[0] = num1; ary[1] = num2;
		System.out.print( ary[0] + " " + ary[1]);
		
		for ( int i = 2; i < 10; i++ ) 
		{
			ary[i] = ( ary[i-2] + ary[i-1] ) % 10; 
			System.out.print( " " + ary[i] );
		}
		in.close();
	}

}
