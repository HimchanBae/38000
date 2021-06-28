package MidTermExam;

import java.util.Scanner;

public class Quiz4 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.print("15명의 학생의 성적을 입력해 주세요 : ");
		int[] ary = new int[15];
		int[] cntAry = new int[10];
		
		for (int i=0; i<15; i++) 
		{
			ary[i] = in.nextInt();
			
			switch (ary[i]/10) 
			{
				case 0 :
					cntAry[0] ++;
					break;
				case 1 : 
					cntAry[1] ++;
					break;
				case 2 :
					cntAry[2] ++;
					break;
				case 3 :
					cntAry[3] ++;
					break;
				case 4 :
					cntAry[4] ++;
					break;
				case 5 :
					cntAry[5] ++;
					break;
				case 6 :
					cntAry[6] ++;
					break;
				case 7 :
					cntAry[7] ++;
					break;
				case 8 :
					cntAry[8] ++;
					break;
				case 9 :
					cntAry[9] ++;
					break;
			}
		}
		
		for (int i=0; i<10; i++) 
		{
			
			if (cntAry[i] != 0) 
			{
				int x = cntAry[i];
				System.out.print( i*10 + " ~ " + (i+1)*10 + " : ");
				for (int j=0; j<x; j++) 
				{
					System.out.print( "*" );
				}
				System.out.println();
			}
		}
		in.close();
	}

}
