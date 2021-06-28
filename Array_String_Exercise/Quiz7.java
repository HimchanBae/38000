package Array_String_Exercise;

import java.util.Scanner;

public class Quiz7 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("5개의 정수를 입력해 주세요 : ");
		int[] ary = new int[5];
		
		for (int i = 0; i < 5; i++) 
		{
			ary[i] = in.nextInt();
		}
		
		String str = ary[0] + "" + ary[1] + "" + ary[2] + "" + ary[3] + "" + ary[4];
		
		int len = str.length();
		int cnt = 0;
		
		for(int i = 0; i < len; i++) //서브스트링으로도 가능?
		{
            System.out.print(str.charAt(i));
            cnt++;
            if (cnt == 3)
            {
                cnt = 0;
                System.out.println();
            }
        }
		in.close();
	}

}
